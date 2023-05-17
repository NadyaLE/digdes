package com.litke.project_manager.pm_business.models.enums;

public enum Role {
    PROJECT_MANAGER("Project Manager"),
    ANALYST("Analyst"),
    DEVELOPER("Developer"),
    TESTER("Tester");

    private final String role;

    Role(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return role;
    }
}
