package com.example.junitstudy.controller;

import com.example.junitstudy.domain.Member;
import com.example.junitstudy.domain.dto.*;
import com.example.junitstudy.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class MemberController {

    private final MemberService memberService;

    @PostMapping("/api/v1/members")
    public CreateMemberResponseDto createMember(@RequestBody CreateMemberRequestDto requestDto) {
        Member member = toMember(requestDto);
        Member saveMember = memberService.save(member);
        return new CreateMemberResponseDto(saveMember);
    }

    @GetMapping("/api/v1/members/{memberId}")
    public MemberResponseDto findMember(@PathVariable Long memberId) {
        Member member = memberService.get(memberId);
        return new MemberResponseDto(member);
    }

    @PutMapping("/api/v1/members/{memberId}")
    public UpdateNicknameResponseDto updateNickname(@PathVariable Long memberId, @RequestBody UpdateNicknameRequestDto nickname) {
        Member member = memberService.get(memberId);
        memberService.updateNickname(nickname);

    }

    private Member toMember(CreateMemberRequestDto requestDto) {
        return Member.builder()
                .username(requestDto.getUsername())
                .nickName(requestDto.getNickName())
                .password(requestDto.getPassword())
                .build();
    }
}
