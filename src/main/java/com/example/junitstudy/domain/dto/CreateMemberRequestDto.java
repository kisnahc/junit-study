package com.example.junitstudy.domain.dto;

import com.example.junitstudy.domain.Member;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class CreateMemberRequestDto {
    private String nickName;
    private String username;
    private String password;
}
