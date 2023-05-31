package org.lafabrique.iam.converter;

import org.lafabrique.iam.domaine.Role;
import org.lafabrique.iam.dto.RoleDto;

import java.util.List;
import java.util.stream.Collectors;

public class RoleConverter {
    public static List<Role> convertRoleDtoToRoleEntity(List<RoleDto> roleDtoList) {
        List<Role> roles = roleDtoList.stream()
                .map(roleDto -> {
                    Role role=new Role();
                    role.setNom(roleDto.getNom());
                    return role;})
                .collect(Collectors.toList());

        return roles;
    }

    public static List<RoleDto> convertRoleEntityToRoleDto(List<Role> roleList) {
        List<RoleDto> rolesDto = roleList.stream()
                .map(role -> {
                    RoleDto roleDto=new RoleDto();
                    roleDto.setNom(role.getNom());
                    roleDto.setId(role.getId());
                    return roleDto;})
                .collect(Collectors.toList());

        return rolesDto;
    }
}
