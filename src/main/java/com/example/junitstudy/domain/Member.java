package com.example.junitstudy.domain;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class Member {

    @Id
    @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    private String username;

    private String nickName;

    private String password;

    @Builder
    public Member(String username, String nickName, String password) {
        this.username = username;
        this.nickName = nickName;
        this.password = password;
    }

    public void updateNickname(String nickName) {
        this.nickName = nickName;
    }
}
