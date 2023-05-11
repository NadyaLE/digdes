package com.litke.project_manager.pm_business.services.impl;

import com.litke.project_manager.pm_business.mapping.MemberMapper;
import com.litke.project_manager.pm_business.models.Member;
import com.litke.project_manager.pm_dto.CreateMemberDto;
import com.litke.project_manager.pm_dto.MemberDto;
import com.litke.project_manager.pm_business.repositories.MemberRepository;
import com.litke.project_manager.pm_business.repositories.impl.MemberRepositoryImpl;
import com.litke.project_manager.pm_business.services.MemberService;

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
