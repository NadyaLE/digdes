package com.litke.project_manager.pm_business.repositories.impl;

import com.litke.project_manager.pm_business.models.Member;
import com.litke.project_manager.pm_business.models.enums.MemberStatus;
import com.litke.project_manager.pm_business.repositories.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;

public class MemberRepositoryImpl implements Repository<Member> {
    protected final List<Member> members = new ArrayList<>();
    private final AtomicLong idGenerator = new AtomicLong(0L);

    public Member create(Member newMember) {
        newMember.setId(idGenerator.incrementAndGet());
        if (newMember.getStatus() != null) {
            if (newMember.getStatus().equals(MemberStatus.ACTIVE)) {
                members.add(newMember);
            }
        }
        return newMember;
    }

    @Override
    public Member update(Member updatedValue) {
        Member res = null;
        Long id = updatedValue.getId();
        if (id != null) {
            res = members.stream().filter(e -> Objects.equals(e.getId(), id)).findAny().orElse(null);
            if (res != null) {
                if (res.getStatus() == MemberStatus.ACTIVE) {
                    res.updateMember(updatedValue);
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
