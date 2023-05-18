package com.litke.project_manager.pm_business.models.enums;

public enum TaskStatus {
    NEW("New"),
    IN_PROGRESS("In developing"),
    COMPLETED("Completed"),
    CLOSED("Closed");

    private final String status;

    TaskStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return status;
    }
}
