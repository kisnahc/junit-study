package com.example.junitstudy.controller;

import com.example.junitstudy.domain.member.Member;
import com.example.junitstudy.domain.member.dto.*;
import com.example.junitstudy.service.MemberService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

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

    @GetMapping("/api/v1/members")
    public Result<MemberResponseDto> findMembers() {
        List<Member> memberList = memberService.getAll();

        List<MemberResponseDto> collect =
                memberList.stream()
                        .map(MemberResponseDto::new)
                        .collect(Collectors.toList());

        return new Result<>(collect.size(), collect);
    }

    @PutMapping("/api/v1/members/{memberId}")
    public UpdateNicknameResponseDto updateNickname(@PathVariable Long memberId, @RequestBody UpdateNicknameRequestDto requestDto) {
        Member updatedMember = memberService.updateNickname(memberId, requestDto.getNickName());
        return new UpdateNicknameResponseDto(updatedMember);
    }

    @DeleteMapping("/api/v1/members/{memberId}")
    public void deleteMember(@PathVariable Long memberId) {
        memberService.delete(memberId);
    }

    private Member toMember(CreateMemberRequestDto requestDto) {
        return Member.builder()
                .username(requestDto.getUsername())
                .nickName(requestDto.getNickName())
                .password(requestDto.getPassword())
                .build();
    }

    @AllArgsConstructor
    @Data
    private static class Result<MemberResponseDto> {
        private int count;
        private List<MemberResponseDto> memberList;
    }
}
