package com.bnpparibas.epita.poo.exo2.vehicules;

public class Train extends Vehicule {
    public Train() {
        super(100);
    }

    @Override
    public String direBonjour() {
        return super.direBonjour() + " TchooTchoo !";
    }
}
