package org.lafabrique.iam.dto;

public class RoleDto {
    private Long id;

    private String nom;

    public RoleDto(Long id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public RoleDto() {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
