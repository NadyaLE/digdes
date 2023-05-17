package com.litke.project_manager.pm_business.services.impl;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;
import com.litke.project_manager.pm_business.models.Member;
import com.litke.project_manager.pm_business.repositories.Repository;
import com.litke.project_manager.pm_business.repositories.impl.MemberRepositoryImpl;
import com.litke.project_manager.pm_business.services.MemberService;
import com.litke.project_manager.pm_dto.MemberDto;

import java.util.List;
import java.util.stream.Collectors;

public class MemberServiceImpl implements MemberService {

    private final ObjectMapper memberMapper = new ObjectMapper().registerModule(new Jdk8Module());
    private final Repository<Member,MemberDto> memberRepository = new MemberRepositoryImpl();

    public MemberDto create(MemberDto newMember) {
        try{
        Member member = memberRepository.create(newMember);
        return memberMapper.updateValue(newMember, member);
        } catch (JsonMappingException ex){
            ex.printStackTrace();
        }
        return null;
    }


    public List<MemberDto> getAll(){
        List<Member> members = memberRepository.getAll();
        return members.stream().map(e -> {MemberDto md = new MemberDto();
            try {
                memberMapper.updateValue(md,e);
            } catch (JsonMappingException ex) {
                ex.printStackTrace();
            }
            return md;
        }).collect(Collectors.toList());
    }
}
