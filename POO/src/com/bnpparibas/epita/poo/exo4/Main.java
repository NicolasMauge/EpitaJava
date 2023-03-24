package com.bnpparibas.epita.poo.exo4;

import com.bnpparibas.epita.poo.exo4.mythic.Centaure;

public class Main {
    public static void main(String[] args) {
        Centaure centaure1 = new Centaure();
        Centaure centaure2 = new Centaure();
        Centaure centaure3 = new Centaure();
        Centaure centaure4 = new Centaure();
        Centaure centaure5 = new Centaure();

        System.out.println("Nombre de centaures : " + Centaure.getPopulation());
    }
}
