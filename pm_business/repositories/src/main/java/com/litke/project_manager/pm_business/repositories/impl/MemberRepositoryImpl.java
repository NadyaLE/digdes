package com.litke.project_manager.pm_business.repositories.impl;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;
import com.litke.project_manager.pm_business.models.Member;
import com.litke.project_manager.pm_business.models.enums.MemberStatus;
import com.litke.project_manager.pm_business.repositories.Repository;
import com.litke.project_manager.pm_dto.MemberDto;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;

public class MemberRepositoryImpl implements Repository<Member, MemberDto> {
    protected final ObjectMapper objectMapper = new ObjectMapper().registerModule(new Jdk8Module());
    protected final List<Member> members = new ArrayList<>();
    private final AtomicLong idGenerator = new AtomicLong(0L);

    public Member create(MemberDto memberDto) {
        Member member = new Member();
        try {
            member = objectMapper.updateValue(member, memberDto);
            if (member.getStatus().equals(MemberStatus.ACTIVE)) {
                member.setId(idGenerator.incrementAndGet());
                members.add(member);
            }
        } catch (JsonMappingException e) {
            e.printStackTrace();
        }
        return member;
    }

    @Override
    public Member update(MemberDto updatedValue) {
        Member res = null;
        Long id = updatedValue.getId().orElse(null);
        if (id != null) {
            res = members.stream().filter(e -> Objects.equals(e.getId(), id)).findAny().orElse(null);
            if (res != null) {
                try {
                    if (res.getStatus() == MemberStatus.ACTIVE) {
                        objectMapper.updateValue(res, updatedValue);
                    }
                } catch (JsonMappingException e) {
                    e.printStackTrace();
                }
            }
        }
        return res;
    }

    @Override
    public Member deleteById(Long id) {
        Member res = members.stream().filter(e -> Objects.equals(e.getId(), id)).findAny().orElse(null);
        if (res != null) {
            res.setStatus(MemberStatus.DELETED);
        }
        return res;
    }

    @Override
    public Member getById(Long id) {
        return members.stream().filter(e -> e.getId().equals(id)).findAny().orElse(null);
    }

    public List<Member> getAll() {
        return members;
    }
}
