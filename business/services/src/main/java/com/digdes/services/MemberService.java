package com.digdes.services;

import com.digdes.dto.CreateMemberDto;
import com.digdes.dto.MemberDto;

import java.util.List;

public interface MemberService {

    MemberDto create(CreateMemberDto memberDto);

    List<MemberDto> getAll();


}
