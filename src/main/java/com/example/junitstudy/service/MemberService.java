package com.example.junitstudy.service;

import com.example.junitstudy.domain.Member;

import java.util.List;

public interface MemberService {
    Member save(Member member);

    Member get(Long id);

    List<Member> getAll();

    void updateNickname(String nickName);

    void delete(Long id);
}
