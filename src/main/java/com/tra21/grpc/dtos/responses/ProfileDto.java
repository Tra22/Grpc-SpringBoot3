package com.tra21.grpc.dtos.responses;

public record ProfileDto(
        Long id,
        String firstName,
        String lastName,
        String profileImage
){}