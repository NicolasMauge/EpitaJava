package com.lafabrique.dto;

public class VoitureDto {
    private Long id;
    private String couleur;

    public VoitureDto(Long id, String couleur) {
        this.id = id;
        this.couleur = couleur;
    }

    public VoitureDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }
}
