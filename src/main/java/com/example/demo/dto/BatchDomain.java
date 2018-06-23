package com.example.demo.dto;

import com.example.demo.entity.DigitalAccount;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BatchDomain extends DigitalAccount{

    private Integer _id;

    private String _state;

    private Integer _uid;


}
