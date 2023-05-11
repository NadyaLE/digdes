package com.litke.project_manager.pm_business.mapping;


import com.litke.project_manager.pm_business.models.Member;
import com.litke.project_manager.pm_dto.CreateMemberDto;
import com.litke.project_manager.pm_dto.MemberDto;

import java.util.StringJoiner;

public class MemberMapper {

    public Member create(CreateMemberDto dto) {
        Member member = new Member();
        member.setFirstName(dto.getFirstName());
        member.setLastName(dto.getLastName());
        return member;
    }

    public MemberDto map(Member entity) {
        MemberDto dto = new MemberDto();
        dto.setId(entity.getId());
        StringJoiner displayNameJoiner = new StringJoiner(" ");
        if (entity.getLastName() != null)
            displayNameJoiner.add(entity.getLastName());
        if (entity.getFirstName() != null)
            displayNameJoiner.add(entity.getFirstName());
        dto.setDisplayName(displayNameJoiner.toString());
        return dto;
    }
}
