package com.bnpparibas.epita.poo.exo2.vehicules;

public class Vehicule {
    int nombreRoues;

    public Vehicule(int nombreRoues) {
        this.nombreRoues = nombreRoues;
    }

    public void direBonjour() {
        System.out.println("Bonjour, je suis un véhicule à " + this.nombreRoues + " roues");
    }
}
