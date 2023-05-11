package com.digdes.repositories;

import com.digdes.model.Member;

import java.util.List;

public interface MemberRepository {

    Member createMember(Member member);

    List<Member> getAll();
}
