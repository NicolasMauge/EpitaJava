package com.lafabrique.domaine;


public class Voiture {
    private Long id;
    private String couleur;

    public Voiture(Long id, String couleur) {
        this.id = id;
        this.couleur = couleur;
    }

    public Voiture() {
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
