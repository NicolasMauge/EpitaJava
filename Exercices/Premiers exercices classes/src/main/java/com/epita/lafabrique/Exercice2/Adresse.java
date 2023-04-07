package com.epita.lafabrique.Exercice2;

public class Adresse {
    private String nomDeRue;
    private String codePostal;
    private String ville;
    private String pays;

    public Adresse(String nomDeRue, String codePostal, String ville, String pays) {
        // contrôle de validité et suggestion sur le formattage des données via une api
        this.nomDeRue = nomDeRue;
        this.codePostal = codePostal;
        this.ville = ville;
        this.pays = pays;
    }

    public String getNomDeRue() {
        return nomDeRue;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public String getVille() {
        return ville;
    }

    public String getPays() {
        return pays;
    }
}
