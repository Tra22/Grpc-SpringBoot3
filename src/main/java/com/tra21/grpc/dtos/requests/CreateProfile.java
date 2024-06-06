package com.tra21.grpc.dtos.requests;

public record CreateProfile(
        String firstName,
        String lastName,
        byte[] profileImage
) {}
