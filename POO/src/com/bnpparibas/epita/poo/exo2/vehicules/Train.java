package com.bnpparibas.epita.poo.exo2.vehicules;

public class Train extends Vehicule {
    public Train() {
        super(100);
    }

    @Override
    public void direBonjour() {
        super.direBonjour();
        System.out.println("TchooTchoo !");
    }
}
