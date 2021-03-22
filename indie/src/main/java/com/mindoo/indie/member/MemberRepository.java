package com.mindoo.indie.member;

import com.mindoo.indie.member.Member;

public interface MemberRepository {
    void save(Member member);
    Member findById(Long memberId);
}
