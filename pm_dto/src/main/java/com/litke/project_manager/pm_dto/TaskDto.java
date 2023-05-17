package com.litke.project_manager.pm_dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.litke.project_manager.pm_business.models.Member;
import com.litke.project_manager.pm_business.models.enums.TaskStatus;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;
import java.util.Optional;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@FieldDefaults(
        level = AccessLevel.PRIVATE
)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TaskDto {
    Optional<Long> id;
    Optional<String> name;
    Optional<String> description;
    Optional<Member> executor;
    Optional<Integer> laborCosts;
    Optional<LocalDateTime> dateCreated;
    Optional<LocalDateTime> dateChanged;
    Optional<LocalDateTime> deadline;
    Optional<Member> author;
    Optional<TaskStatus> status;
}


    //};
//    private interface Id {Long getId();}
//    private interface Name {String getName();}
//    private interface Description {String getDescription();}
//    private interface Executor { Member getExecutor();}
//    private interface LaborCosts {Integer getLaborCosts();}
//    private interface DateCreated {Date getDateCreated();}
//    private interface DateChanged {Date getDateChanged();}
//    private interface Deadline {Date getDeadline();}
//    private interface Author {Member getAuthor();}
//    private interface Status {TaskStatus getStatus();}
//
//    public enum Request{;
//        @Data
//        @AllArgsConstructor
//        @NoArgsConstructor
//        public static class Create implements Name, Description, Executor, LaborCosts,
//        DateCreated, DateChanged, Deadline, Author{
//            String name;
//            String description;
//            Member executor;
//            Integer laborCosts;
//            Date dateCreated;
//            Date dateChanged;
//            Date deadline;
//            Member author;
//        }
//    }
//
//    public enum Response{;
//        @Data
//        @AllArgsConstructor
//        @NoArgsConstructor
//        public static class Public implements Id, Name, Executor, Deadline, Status {
//            Long id;
//            String name;
//            Member executor;
//            Date deadline;
//            TaskStatus status;
//        }
//
//        @Data
//        @AllArgsConstructor
//        @NoArgsConstructor
//        public static class Private implements Id, Name, Executor, LaborCosts, DateCreated, Deadline, Author, Status{
//            Long id;
//            String name;
//            Member executor;
//            Integer laborCosts;
//            Date dateCreated;
//            Date deadline;
//            Member author;
//            TaskStatus status;
//        }
//    }
//}
