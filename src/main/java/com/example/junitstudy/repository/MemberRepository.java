package com.example.junitstudy.repository;

import com.example.junitstudy.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
    Member findByNickName(String nickName);
}
