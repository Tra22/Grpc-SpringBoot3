package com.tra21.grpc.services.upload;

import com.tra21.grpc.services.upload.interf.IFileUploadService;
import jakarta.annotation.PostConstruct;
import lombok.extern.log4j.Log4j2;
import org.slf4j.helpers.MessageFormatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.util.FileSystemUtils;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;

@Service
@Log4j2
public class FileUploadService implements IFileUploadService {
    @Value("${upload.folder.path:file:///grpc/uploads}")
    private String uploadFolderPath;
    @Autowired
    private ResourceLoader resourceLoader;
    private Path root; //= Paths.get("demo/src/main/resources/static/uploads");
    @PostConstruct
    private void FileUploadServicePostConstruct() {
        try {
            this.root = Paths.get(resourceLoader.getResource(uploadFolderPath).getURI());
        } catch (IOException e) {
            log.error("Error to get main path upload file", e);
        }
    }

    @Override
    public void init() {
        try {
            Files.createDirectories(root);
        } catch (IOException e) {
            throw new RuntimeException("Could not initialize folder for upload!");
        }
    }

    @Override
    public void save(ByteArrayOutputStream byteArrayOutputStream, String filename) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(this.root.resolve(Objects.requireNonNull(filename)).toFile());
            byteArrayOutputStream.writeTo(fileOutputStream);
            fileOutputStream.close();
        } catch (Exception e) {
            if (e instanceof FileAlreadyExistsException) {
                throw new RuntimeException("A file of that name already exists.");
            }

            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public void save(ByteArrayOutputStream byteArrayOutputStream, String path, String fileName) {
        try {
            File pathFile = new File(path);
            if(!pathFile.exists()){
                boolean isCreate = pathFile.mkdirs();
            }
            String filePath = MessageFormatter.format("{}/{}", path, fileName).getMessage();
            FileOutputStream fileOutputStream = new FileOutputStream(this.root.resolve(Paths.get(filePath)).toFile());
            byteArrayOutputStream.writeTo(fileOutputStream);
            fileOutputStream.close();
        } catch (Exception e) {
            log.error("file upload ", e);
            if (e instanceof FileAlreadyExistsException) {
                throw new RuntimeException("A file of that name already exists.");
            }

            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public String generateNewFilename(String oldName, String newName) {
        String[] exLogo = Optional.ofNullable(oldName).orElse("").split("\\.");
        return MessageFormatter.format("{}.{}", newName, exLogo[exLogo.length - 1]).getMessage();
    }

    @Override
    public Resource load(String filename) {
        try {
            Path file = root.resolve(filename);
            Resource resource = new UrlResource(file.toUri());

            if (resource.exists() || resource.isReadable()) {
                return resource;
            } else {
                throw new RuntimeException("Could not read the file!");
            }
        } catch (MalformedURLException e) {
            throw new RuntimeException("Error: " + e.getMessage());
        }
    }

    @Override
    public void deleteAll() {
        FileSystemUtils.deleteRecursively(root.toFile());
    }

    @Override
    public Stream<Path> loadAll() {
        try {
            return Files.walk(this.root, 1).filter(path -> !path.equals(this.root)).map(this.root::relativize);
        } catch (IOException e) {
            throw new RuntimeException("Could not load the files!");
        }
    }
}
