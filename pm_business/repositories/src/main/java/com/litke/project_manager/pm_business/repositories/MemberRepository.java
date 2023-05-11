package com.litke.project_manager.pm_business.repositories;

import com.litke.project_manager.pm_business.models.Member;

import java.util.List;

public interface MemberRepository {

    Member createMember(Member member);

    List<Member> getAll();
}
