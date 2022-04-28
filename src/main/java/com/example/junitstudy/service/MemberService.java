package com.example.junitstudy.service;

import com.example.junitstudy.domain.member.Member;

import java.util.List;

public interface MemberService {
    Member save(Member member);

    Member get(Long id);

    List<Member> getAll();

    Member updateNickname(Long id, String nickName);

    Member getByNickname();
    void delete(Long id);
}
