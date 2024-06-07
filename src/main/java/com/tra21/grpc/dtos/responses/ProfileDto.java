package com.tra21.grpc.dtos.responses;

import lombok.Data;

@Data
public class ProfileDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String profileImage;
}