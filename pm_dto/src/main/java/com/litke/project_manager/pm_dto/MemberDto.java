package com.litke.project_manager.pm_dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.litke.project_manager.pm_business.models.enums.MemberStatus;
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
public class MemberDto {
    Long id;
    Optional<String> firstName;
    Optional<String> lastName;
    Optional<String> surname;
    Optional<String> jobTitle;
    Optional<String> account;
    Optional<String> email;
    Optional<MemberStatus> status;
}


    //;
//    private interface Id { Long getId(); }
//    private interface FirstName { @NotBlank String getFirstName(); }
//    private interface LastName { @NotBlank String getLastName(); }
//    private interface Surname { String getSurname(); }
//    private interface JobTitle { String getJobTitle(); }
//    private interface Account { String getAccount(); }
//    private interface Email {  String getEmail(); }
//    private interface Status {  MemberStatus getStatus(); }
//
//
//    public enum Request{;
//        @Data
//        @AllArgsConstructor
//        @NoArgsConstructor
//        public static class Create implements FirstName, LastName,
//                Surname, JobTitle, Account, Email {
//            String firstName;
//            String lastName;
//            String surname;
//            String jobTitle;
//            String account;
//            String email;
//        }
//    }
//
//    public enum Response{;
//        @Data
//        @AllArgsConstructor
//        @NoArgsConstructor
//        public static class Public implements Id, FirstName, LastName, Email{
//            Long id;
//            String firstName;
//            String lastName;
//            String email;
//        }
//
//        @Data
//        @AllArgsConstructor
//        @NoArgsConstructor
//        public static class Private implements
//                Id, FirstName, LastName,Surname, JobTitle, Status {
//            Long id;
//            String firstName;
//            String lastName;
//            String surname;
//            String jobTitle;
//            MemberStatus status;
//        }
//    }
//}
