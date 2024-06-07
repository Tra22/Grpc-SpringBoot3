package com.tra21.grpc.services.upload;

import com.tra21.grpc.dtos.global.requests.UploadImagesDto;
import com.tra21.grpc.dtos.global.responses.ImageDto;
import com.tra21.grpc.services.upload.interf.IFileUploadService;
import com.tra21.grpc.services.upload.interf.IUploadService;
import lombok.RequiredArgsConstructor;
import org.slf4j.helpers.MessageFormatter;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UploadService implements IUploadService {
    private final IFileUploadService fileUploadService;
    private final String pathUpload = "images";
    @Override
    public ImageDto uploadImage(UploadImagesDto uploadImagesDto) {
            String newLogoFilename = fileUploadService.generateNewFilename("old_name." + uploadImagesDto.getFile().getFileType(), UUID.randomUUID().toString());
            fileUploadService.save(
                    uploadImagesDto.getByteArrayOutputStream(),
                    pathUpload,
                    newLogoFilename
            );
        return ImageDto.builder()
                        .filename(newLogoFilename)
                        .fileType(uploadImagesDto.getFile().getFileType())
                        .pathFile(MessageFormatter.format("{}/{}", pathUpload, newLogoFilename).getMessage())
                    .build();
    }
}
