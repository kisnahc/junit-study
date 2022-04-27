package com.example.junitstudy.domain.dto;

import lombok.Data;

@Data
public class UpdateNicknameResponseDto {

    private Long id;
    private String before;
    private String after;
}
