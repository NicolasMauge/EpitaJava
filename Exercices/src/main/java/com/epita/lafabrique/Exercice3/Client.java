package com.epita.lafabrique.Exercice3;

public class Client {
    private String nom;
    private int age;
    private Adresse adresse;

    public Client(String nom, int age, Adresse adresse) {
        this.nom = nom;
        this.age = age;
        this.adresse = adresse;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }
}
