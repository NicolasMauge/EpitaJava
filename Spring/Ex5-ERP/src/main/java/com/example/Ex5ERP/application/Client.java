package com.example.Ex5ERP.application;

public class Client {
    private Identite identite;

    private Adresse adresse;

    private String email;

    public Client(Identite identite, Adresse adresse, String email) {
        this.identite = identite;
        this.adresse = adresse;
        this.email = email;
    }

    @Override
    public String toString() {
        return identite.getNom() + " " + identite.getDateNaissance() + " " + email;
    }

    public Identite getIdentite() {
        return identite;
    }

    public void setIdentite(Identite identite) {
        this.identite = identite;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
