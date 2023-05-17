package com.litke.project_manager.pm_business.models;

import com.litke.project_manager.pm_business.models.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Team implements Serializable {
    private Long id;
    private Project teamProject;
    private Map<Member, Role> membersRole = new HashMap<>();
}
