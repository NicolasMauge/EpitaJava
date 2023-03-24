package com.bnpparibas.epita.poo.exo4.mythic;

public class Centaure {
    private static int population = 0;

    public Centaure() {
        population++;
    }

    public int getBRAS() {
        int BRAS = 2;
        return BRAS;
    }

    public int getPATTES() {
        int PATTES = 2;
        return PATTES;
    }

    public static int getPopulation() {
        return population;
    }
}
