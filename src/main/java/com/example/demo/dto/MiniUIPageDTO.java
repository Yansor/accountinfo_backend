package com.example.demo.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class MiniUIPageDTO<T>{

    private long total;

    private T data;

    @Builder.Default
    private boolean isSuccess = true;

    private String message;
}

