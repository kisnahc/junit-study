package com.example.junitstudy.repository;

import com.example.junitstudy.domain.member.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
    Member findByNickName(String nickName);
}
