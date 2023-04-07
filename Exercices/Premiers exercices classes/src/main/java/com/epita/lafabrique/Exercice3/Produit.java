package com.epita.lafabrique.Exercice3;

public class Produit {
    private String nom;
    private int prix;
    private String codeABarre;

    public Produit(String nom, int prix, String codeABarre) {
        this.nom = nom;
        this.prix = prix;
        this.codeABarre = codeABarre;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public String getCodeABarre() {
        return codeABarre;
    }

    public void setCodeABarre(String codeABarre) {
        this.codeABarre = codeABarre;
    }
}
