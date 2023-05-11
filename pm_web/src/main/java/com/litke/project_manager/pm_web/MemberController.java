package com.litke.project_manager.pm_web;

import com.litke.project_manager.pm_dto.CreateMemberDto;
import com.litke.project_manager.pm_dto.MemberDto;
import com.litke.project_manager.pm_business.services.MemberService;
import com.litke.project_manager.pm_business.services.impl.MemberServiceImpl;

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
