package com.digdes.repositories.impl;

import com.digdes.models.Member;
import com.digdes.repositories.MemberRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

public class MemberRepositoryImpl implements MemberRepository {

    private final List<Member> members = new ArrayList<>();
    private final AtomicLong idGenerator = new AtomicLong(0L);

    public Member createMember(Member member){
        member.setId(idGenerator.incrementAndGet());
        members.add(member);
        return member;
    }

    public List<Member> getAll(){
        return members;
    }
}
