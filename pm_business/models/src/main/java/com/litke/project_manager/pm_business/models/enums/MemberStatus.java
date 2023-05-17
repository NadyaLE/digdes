package com.litke.project_manager.pm_business.models.enums;

public enum MemberStatus {
    ACTIVE("Active"),
    DELETED("Deleted");

    private final String status;

    MemberStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return status;
    }
}
