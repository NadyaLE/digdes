package com.litke.project_manager.pm_business.models;

import com.litke.project_manager.pm_business.models.enums.MemberStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Member implements Serializable {
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

    public Member setId(Long id) {
        this.id = id;
        return this;
    }

    public Member setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Member setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public Member setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public Member setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
        return this;
    }

    public Member setAccount(String account) {
        this.account = account;
        return this;
    }

    public Member setEmail(String email) {
        this.email = email;
        return this;
    }

    public Member setStatus(MemberStatus status) {
        this.status = status;
        return this;
    }
}
