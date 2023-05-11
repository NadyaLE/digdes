package com.digdes.web;

import com.digdes.dto.CreateMemberDto;
import com.digdes.dto.MemberDto;
import com.digdes.services.MemberService;
import com.digdes.services.impl.MemberServiceImpl;

import java.util.List;

public class MemberController {

    private final MemberService memberService = new MemberServiceImpl();



    public MemberDto create(CreateMemberDto request){
        return memberService.create(request);
    }

    public List<MemberDto> getAll(){
        return memberService.getAll();
    }
}
