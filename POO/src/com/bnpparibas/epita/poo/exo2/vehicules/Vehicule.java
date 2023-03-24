package com.bnpparibas.epita.poo.exo2.vehicules;

public class Vehicule {
    int nombreRoues;

    public Vehicule(int nombreRoues) {
        this.nombreRoues = nombreRoues;
    }

    public String direBonjour() {
        return "Bonjour, je suis un véhicule à " + this.nombreRoues + " roues";
    }

    @Override
    public String toString() {
        return this.direBonjour();
    }
}
