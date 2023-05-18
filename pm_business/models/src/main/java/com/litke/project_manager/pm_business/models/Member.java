package com.litke.project_manager.pm_business.models;

import com.litke.project_manager.pm_business.models.enums.MemberStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Member implements Serializable{
    private Long id;
    private String firstName;
    private String lastName;
    private String surname;
    private String jobTitle;
    private String account;
    private String email;
    private MemberStatus status = MemberStatus.ACTIVE;

    public Member(String firstName, String lastName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public void updateMember(Member member){
        this.firstName = member.getFirstName();
        this.lastName = member.getLastName();
        this.surname = member.getSurname();
        this.jobTitle = member.getJobTitle();
        this.account = member.getAccount();
        this.email = member.getEmail();
        this.status = member.getStatus();
    }
}
