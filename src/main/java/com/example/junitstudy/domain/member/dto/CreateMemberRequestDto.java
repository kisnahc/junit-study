package com.example.junitstudy.domain.member.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class CreateMemberRequestDto {

    private String nickName;
    private String username;
    private String password;
}
