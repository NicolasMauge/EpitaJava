package org.lafabrique.iam.dto;

import java.util.List;

public class ClientDto {
    private Long id;
    private String email;
    private String password;
    private List<RoleDto> roles;

    private AdresseDto adresseDto;

    public ClientDto(Long id, String email, String password, List<RoleDto> roles, AdresseDto adresseDto) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.roles = roles;
        this.adresseDto = adresseDto;
    }

    public ClientDto() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<RoleDto> getRoles() {
        return roles;
    }

    public void setRoles(List<RoleDto> roles) {
        this.roles = roles;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public AdresseDto getAdresseDto() {
        return adresseDto;
    }

    public void setAdresseDto(AdresseDto adresseDto) {
        this.adresseDto = adresseDto;
    }
}
