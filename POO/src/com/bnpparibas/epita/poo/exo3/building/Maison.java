package com.bnpparibas.epita.poo.exo3.building;

public class Maison implements AvecChauffage, AvecClimatisation {
    private int temperature;

    public Maison(int temperature) {
        this.temperature = temperature;
    }

    /**
     * Chauffe la température de 1 degré
     */
    @Override
    public void chauffer() {
        this.temperature ++;
    }

    /**
     * Refroidit la température de 1 degré
     */
    @Override
    public void refroidir() {
        this.temperature--;
    }

    public int getTemperature() {
        return temperature;
    }
}
