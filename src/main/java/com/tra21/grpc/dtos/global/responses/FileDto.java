package com.tra21.grpc.dtos.global.responses;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Builder
public class FileDto implements Serializable {
    private String fileType;
    private String fileMimeType;
}
