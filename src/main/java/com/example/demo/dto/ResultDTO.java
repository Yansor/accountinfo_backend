package com.example.demo.dto;

import lombok.*;

@Builder
@Getter
@Setter
public class ResultDTO<T> {

    @Builder.Default
    private Boolean isSuccess = Boolean.TRUE;
    private String message;
    private T data;




}
