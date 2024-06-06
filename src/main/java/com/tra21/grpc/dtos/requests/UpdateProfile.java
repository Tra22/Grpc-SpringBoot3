package com.tra21.grpc.dtos.requests;

public record UpdateProfile(
   Long id,
   String firstName,
   String lastName,
   String profileImage
) {}
