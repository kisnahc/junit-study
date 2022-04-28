package com.example.junitstudy.domain.member.dto;

import com.example.junitstudy.domain.member.Member;
import lombok.Data;

@Data
public class UpdateNicknameResponseDto {

    private Long id;
    private String updatedNickname;

    public UpdateNicknameResponseDto(Member member) {
        this.id = member.getId();
        this.updatedNickname = member.getNickName();
    }
}
