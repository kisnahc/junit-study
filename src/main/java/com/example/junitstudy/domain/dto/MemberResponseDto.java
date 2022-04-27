package com.example.junitstudy.domain.dto;

import com.example.junitstudy.domain.Member;
import lombok.Data;

@Data
public class MemberResponseDto {
    private Long id;
    private String username;
    private String nickName;

    public MemberResponseDto(Member member) {
        this.id = member.getId();
        this.username = member.getUsername();
        this.nickName = member.getNickName();
    }
}
