package com.tra21.grpc.services.upload.interf;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.nio.file.Path;
import java.util.stream.Stream;

public interface IFileUploadService {
    public void init();
    public void save(ByteArrayOutputStream byteArrayOutputStream, String filename);
    public void save(ByteArrayOutputStream byteArrayOutputStream, String path, String fileName);
    public String generateNewFilename(String oldName, String newName);
    public Resource load(String filename);
    public void deleteAll();
    public Stream<Path> loadAll();
}
