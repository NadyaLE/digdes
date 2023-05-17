package com.litke.project_manager.pm_business.models.enums;

public enum ProjectStatus {
    DRAFT("Draft"),
    IN_DEVELOPING("In developing"),
    IN_TESTING("In testing"),
    COMPLETED("Completed");

    private final String status;

    ProjectStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return status;
    }
}
