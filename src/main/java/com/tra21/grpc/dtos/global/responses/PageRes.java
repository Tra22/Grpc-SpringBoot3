package com.tra21.grpc.dtos.global.responses;

import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Data
@SuperBuilder
public class PageRes<T> {
    private List<T> data;
    private PaginationRes paginationRes;
}
