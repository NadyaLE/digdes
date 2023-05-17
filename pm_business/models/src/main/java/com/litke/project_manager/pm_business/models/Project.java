package com.litke.project_manager.pm_business.models;

import com.litke.project_manager.pm_business.models.enums.ProjectStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

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

    public Project setId(Long id) {
        this.id = id;
        return this;
    }

    public Project setProjectCode(String projectCode) {
        this.projectCode = projectCode;
        return this;
    }

    public Project setName(String name) {
        this.name = name;
        return this;
    }

    public Project setDescription(String description) {
        this.description = description;
        return this;
    }

    public Project setStatus(ProjectStatus status) {
        this.status = status;
        return this;
    }
}
