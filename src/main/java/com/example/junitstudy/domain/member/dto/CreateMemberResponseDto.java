package com.example.junitstudy.domain.member.dto;

import com.example.junitstudy.domain.member.Member;
import lombok.Data;

@Data
public class CreateMemberResponseDto {
    private Long id;
    private String nickName;

    public CreateMemberResponseDto(Member member) {
        this.id = member.getId();
        this.nickName = member.getNickName();
    }
}
