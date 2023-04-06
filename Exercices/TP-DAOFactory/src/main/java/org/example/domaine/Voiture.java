package org.example.domaine;

public class Voiture {
    private String couleur;
    private String modele;

    public Voiture(String couleur, String modele) {
        this.couleur = couleur;
        this.modele = modele;
    }

    public Voiture() {
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }
}
