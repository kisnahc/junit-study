package com.example.junitstudy.service.impl;

import com.example.junitstudy.domain.member.Member;
import com.example.junitstudy.repository.MemberRepository;
import com.example.junitstudy.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Transactional(readOnly = true)
@RequiredArgsConstructor
@Service
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;

    @Transactional
    @Override
    public Member save(Member member) {
        return memberRepository.save(member);
    }

    @Override
    public Member get(Long id) {
        Optional<Member> findMemberId = memberRepository.findById(id);
        return findMemberId.orElseThrow(() -> new IllegalArgumentException("member not found"));
    }

    @Override
    public List<Member> getAll() {
        return memberRepository.findAll();
    }

    @Transactional
    @Override
    public Member updateNickname(Long id, String nickName) {
        Member findMember = get(id);
        findMember.updateNickname(nickName);
        return findMember;
    }

    @Transactional
    @Override
    public void delete(Long id) {
        memberRepository.deleteById(id);
    }

    @Override
    public Member getByNickname() {
        return null;
    }
}
