package com.digdes.mapping;

import com.digdes.dto.CreateMemberDto;
import com.digdes.dto.MemberDto;
import com.digdes.model.Member;

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
