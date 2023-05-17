package com.litke.project_manager.pm_business.repositories.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.litke.project_manager.pm_business.models.Member;
import com.litke.project_manager.pm_dto.MemberDto;

import java.io.*;
import java.util.List;

public class MemberStorage extends MemberRepositoryImpl {

    @Override
    public Member create(MemberDto value) {
        return super.create(value);
    }

    @Override
    public Member update(MemberDto updatedValue) {
        return super.update(updatedValue);
    }

    @Override
    public Member deleteById(Long id) {
        return super.deleteById(id);
    }

    @Override
    public Member getById(Long id) {
        return super.getById(id);
    }

    @Override
    public List<Member> getAll() {
        return members;
    }

    public void writeStorage(String filePath) {
        try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(filePath)))) {
            members.forEach(e -> {
                try {
                    writer.println(objectMapper.writeValueAsString(e));
                } catch (JsonProcessingException ex) {
                    ex.printStackTrace();
                }
            });
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void readStorage(String filePath){
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            members.clear();
            String member = reader.readLine();
            while (member!=null){
                members.add(objectMapper.readValue(member,Member.class));
                member = reader.readLine();
            }
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
