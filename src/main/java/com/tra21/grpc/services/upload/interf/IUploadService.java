package com.tra21.grpc.services.upload.interf;

import com.tra21.grpc.dtos.global.requests.UploadImagesDto;
import com.tra21.grpc.dtos.global.responses.ImageDto;

public interface IUploadService {
    ImageDto uploadImage(UploadImagesDto uploadImagesDto);
}
