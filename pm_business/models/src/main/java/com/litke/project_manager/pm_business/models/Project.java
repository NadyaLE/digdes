package com.litke.project_manager.pm_business.models;

import com.litke.project_manager.pm_business.models.enums.ProjectStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Project implements Serializable {
    private Long id;
    private String projectCode;
    private String name;
    private String description;
    private ProjectStatus status = ProjectStatus.DRAFT;

    public Project(String projectCode, String name) {
        this.projectCode = projectCode;
        this.name = name;
    }
}
