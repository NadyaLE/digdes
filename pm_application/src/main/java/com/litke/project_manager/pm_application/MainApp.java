package com.litke.project_manager.pm_application;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.litke.project_manager.pm_business.models.Member;
import com.litke.project_manager.pm_business.models.Project;
import com.litke.project_manager.pm_business.models.Task;
import com.litke.project_manager.pm_business.models.enums.Role;
import com.litke.project_manager.pm_dto.MemberDto;
import com.litke.project_manager.pm_dto.ProjectDto;
import com.litke.project_manager.pm_dto.TeamDto;
import com.litke.project_manager.pm_web.MemberController;

import java.io.*;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Optional;

public class MainApp {

    private static final MemberController memberController = new MemberController();

    public static void main(String... args) {
//        MemberDto newMember1 = new MemberDto();
//        newMember1.setFirstName(Optional.of("Иван"));
//        newMember1.setLastName(Optional.of("Федорович"));
//        MemberDto createdMember1 = memberController.create(newMember1);
//        System.out.println("===== Created member 1========");
//        System.out.println(createdMember1);
//
//
//        MemberDto newMember2 = new MemberDto();
//        newMember2.setFirstName(Optional.of("Дима"));
//        newMember2.setLastName(Optional.of("Какой"));
//
//        System.out.println("===== Created member 2 ========");
//        MemberDto createdMember2 = memberController.create(newMember2);
//        System.out.println(createdMember2);
//
//        System.out.println("======== All members =========");
//        List<MemberDto> allMembers = memberController.getAll();
//        System.out.println(allMembers);


        Member person = new Member("Sasha","Ivanov");
        Member person2 = new Member("Alex","Smirnov");

        Task task = new Task("sort",120, LocalDateTime.now());
        Task task2 = new Task("reverse",80, LocalDateTime.now());

        Project project = new Project("1L","project1");
        Project project2 = new Project("2L","project2");

        TeamDto team = new TeamDto(12L, Optional.of(new Project("sos", "sad")),
                Optional.of(new HashMap<>(){{put(person, Role.ANALYST); put(person2,Role.DEVELOPER);}}));
        TeamDto team2 = new TeamDto(13L, Optional.of(new Project("sos", "sad")), Optional.of(new HashMap<>()));


        String jsonString = null;
        String jsonString2 = null;
        Member p = null;
        try(PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(".\\Files\\out.txt")));
            BufferedReader br = new BufferedReader(new FileReader(".\\Files\\out.txt"))) {
            ObjectMapper mapper = new ObjectMapper().registerModules(new Jdk8Module(), new JavaTimeModule());

            // Сериализация объекта — преобразование объекта `Person` в строку JSON
            MemberDto md = new MemberDto();
            md.setId(13L);
            md.setLastName(Optional.of("Rere"));
            md.setStatus(Optional.empty());

            jsonString = mapper.writeValueAsString(project);
            jsonString2 = mapper.writeValueAsString(project2);

            System.out.println("Converting Person object to JSON string:\n"
                   + jsonString + "\n");

            ProjectDto projectDto = new ProjectDto();
            projectDto.setDescription(Optional.of("ds"));
            mapper.updateValue(project,projectDto);
            System.out.println("Converting Person object to JSON string:\n"
                    + project + "\n");

            writer.println(jsonString);
            writer.println(jsonString2);
            writer.close();

            // Десериализовать объект — преобразовать строку JSON в объект `Person`
//            p = mapper.readValue(jsonString, Member.class);
//            System.out.println(p);
            ProjectDto[] brm = new ProjectDto[2];
            int count = 0;
            String s = br.readLine();
            while(s != null){
                brm[count++] = mapper.readValue(s, ProjectDto.class);
                s = br.readLine();
            }
            System.out.println(Arrays.toString(brm));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
