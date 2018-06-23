package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GetDigitalAccountRequestDTO {
    private String name ;

    private String url;

    private String remark;

    private String username;

    private String password;

}
