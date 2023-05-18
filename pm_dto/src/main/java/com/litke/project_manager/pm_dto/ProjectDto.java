package com.litke.project_manager.pm_dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.litke.project_manager.pm_business.models.enums.ProjectStatus;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Optional;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@FieldDefaults(
        level = AccessLevel.PRIVATE
)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProjectDto {
    Long id;
    Optional<String> projectCode;
    Optional<String> name;
    Optional<String> description;
    Optional<ProjectStatus> status;
}



    //;
//    private interface Id {Long getId();}
//    private interface ProjectCode {String getProjectCode();}
//    private interface Name {String getName();}
//    private interface Description {String getDescription();}
//    private interface Status { ProjectStatus getProjectStatus();}
//
//    public enum Request{;
//        @Data
//        @AllArgsConstructor
//        @NoArgsConstructor
//        public static class Create implements ProjectCode, Name, Description {
//            String projectCode;
//            String name;
//            String description;
//        }
//    }
//
//    public enum Response{;
//        @Data
//        @AllArgsConstructor
//        @NoArgsConstructor
//        public static class Public implements Id, ProjectCode, Name, Status{
//            Long id;
//            String projectCode;
//            String name;
//            ProjectStatus projectStatus;
//        }
//
//        @Data
//        @AllArgsConstructor
//        @NoArgsConstructor
//        public static class Private implements Id, ProjectCode,
//                Name, Description, Status{
//            Long id;
//            String projectCode;
//            String name;
//            String description;
//            ProjectStatus projectStatus;
//        }
//    }
//}
