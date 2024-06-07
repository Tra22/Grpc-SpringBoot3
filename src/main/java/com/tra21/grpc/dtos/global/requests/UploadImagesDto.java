package com.tra21.grpc.dtos.global.requests;

import com.tra21.grpc.dtos.global.responses.FileDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.ByteArrayOutputStream;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UploadImagesDto implements Serializable {
    private FileDto file;
    private ByteArrayOutputStream byteArrayOutputStream;
}
