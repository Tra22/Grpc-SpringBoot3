package com.tra21.grpc.dtos.global.requests;

public record PaginationReq(
        Integer size,
        Integer page
){}
