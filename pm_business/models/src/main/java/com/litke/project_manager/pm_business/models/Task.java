package com.litke.project_manager.pm_business.models;

import com.litke.project_manager.pm_business.models.enums.TaskStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Builder
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
}
