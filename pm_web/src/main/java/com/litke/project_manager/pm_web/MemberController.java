package com.litke.project_manager.pm_web;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.litke.project_manager.pm_business.services.MemberService;
import com.litke.project_manager.pm_business.services.impl.MemberServiceImpl;
import com.litke.project_manager.pm_dto.MemberDto;

import java.util.List;

public class MemberController {

    private final MemberService memberService = new MemberServiceImpl();

    public MemberDto create(MemberDto request) {
        return memberService.create(request);
    }

    public List<MemberDto> getAll(){
        return memberService.getAll();
    }
}
