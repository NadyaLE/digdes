package com.litke.project_manager.pm_business.models;

import com.litke.project_manager.pm_business.models.enums.TaskStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Task implements Serializable {
    private Long id;
    private String name;
    private String description;
    private Member executor;
    private Integer laborCosts;
    private LocalDateTime dateCreated;
    private LocalDateTime dateChanged;
    private LocalDateTime deadline;
    private Member author;
    private TaskStatus status = TaskStatus.NEW;

    public Task(String name, Integer laborCosts, LocalDateTime deadline) {
        this.name = name;
        this.laborCosts = laborCosts;
        this.deadline = deadline;
    }

    public Task setId(Long id) {
        this.id = id;
        return this;
    }

    public Task setName(String name) {
        this.name = name;
        return this;
    }

    public Task setDescription(String description) {
        this.description = description;
        return this;
    }

    public Task setExecutor(Member executor) {
        this.executor = executor;
        return this;
    }

    public Task setLaborCosts(Integer laborCosts) {
        this.laborCosts = laborCosts;
        return this;
    }

    public Task setDateCreated(LocalDateTime dateCreated) {
        this.dateCreated = dateCreated;
        return this;
    }

    public Task setDateChanged(LocalDateTime dateChanged) {
        this.dateChanged = dateChanged;
        return this;
    }

    public Task setDeadline(LocalDateTime deadline) {
        this.deadline = deadline;
        return this;
    }

    public Task setAuthor(Member author) {
        this.author = author;
        return this;
    }

    public Task setStatus(TaskStatus status) {
        this.status = status;
        return this;
    }
}
