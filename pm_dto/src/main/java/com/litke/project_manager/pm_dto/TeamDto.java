package com.litke.project_manager.pm_dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.litke.project_manager.pm_business.models.Member;
import com.litke.project_manager.pm_business.models.Project;
import com.litke.project_manager.pm_business.models.enums.Role;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Map;
import java.util.Optional;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@FieldDefaults(
        level = AccessLevel.PRIVATE
)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TeamDto {
    Long id;
    Optional<Project> teamProject;
    Optional<Map<Member, Role>> membersRole;
}


//public enum TeamDto {;
//    private interface  Id {Long getId();}
//    private interface TeamProject {Project getTeamProject();}
//    private interface  MembersRole {Map<Member, Role> getMembersRole();}
//
//    public enum Request{;
//        @Data
//        @AllArgsConstructor
//        @NoArgsConstructor
//        public static class Create implements TeamProject, MembersRole {
//            Project teamProject;
//            Map<Member, Role> membersRole;
//        }
//    }
//
//    public enum Response{;
//        @Data
//        @AllArgsConstructor
//        @NoArgsConstructor
//        public static class Public implements Id, TeamProject{
//            Long id;
//            Project teamProject;
//        }
//
//        @Data
//        @AllArgsConstructor
//        @NoArgsConstructor
//        public static class Private implements Id, TeamProject, MembersRole{
//            Long id;
//            Project teamProject;
//            Map<Member, Role> membersRole;
//        }
//    }
//}
