package com.litke.project_manager.pm_business.services;

import com.litke.project_manager.pm_dto.CreateMemberDto;
import com.litke.project_manager.pm_dto.MemberDto;

import java.util.List;

public interface MemberService {

    MemberDto create(CreateMemberDto memberDto);

    List<MemberDto> getAll();


}
