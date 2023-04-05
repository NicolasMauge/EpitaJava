package com.example.TPVoiture.application;

import java.util.List;

public class Voiture {
    private int id;
    private String couleur;
    private List<String> equipement;
    private String nom;

    public Voiture(int id, String couleur, List<String> equipement, String nom) {
        this.id = id;
        this.couleur = couleur;
        this.equipement = equipement;
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public List<String> getEquipement() {
        return equipement;
    }

    public void setEquipement(List<String> equipement) {
        this.equipement = equipement;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
