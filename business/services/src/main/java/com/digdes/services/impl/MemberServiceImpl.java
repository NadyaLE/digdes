package com.digdes.services.impl;

import com.digdes.dto.CreateMemberDto;
import com.digdes.dto.MemberDto;
import com.digdes.mapping.MemberMapper;
import com.digdes.model.Member;
import com.digdes.repositories.MemberRepository;
import com.digdes.repositories.impl.MemberRepositoryImpl;
import com.digdes.services.MemberService;

import java.util.List;
import java.util.stream.Collectors;

public class MemberServiceImpl implements MemberService {

    private final MemberMapper memberMapper = new MemberMapper();
    private final MemberRepository memberRepository = new MemberRepositoryImpl();

    public MemberDto create(CreateMemberDto newMember){
        Member member = memberMapper.create(newMember);
        member = memberRepository.createMember(member);
        return memberMapper.map(member);
    }

    public List<MemberDto> getAll(){
        List<Member> members = memberRepository.getAll();
        return members.stream().map(memberMapper::map).collect(Collectors.toList());
    }
}
