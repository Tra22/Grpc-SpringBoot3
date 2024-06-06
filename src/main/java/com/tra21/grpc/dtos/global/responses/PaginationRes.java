package com.tra21.grpc.dtos.global.responses;

public record PaginationRes(
   Integer page,
   Integer size,
   Long totalElements,
   Integer totalPages
) {}
