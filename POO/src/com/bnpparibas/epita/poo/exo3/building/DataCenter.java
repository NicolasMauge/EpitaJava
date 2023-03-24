package com.bnpparibas.epita.poo.exo3.building;

public class DataCenter implements AvecClimatisation {
    private int temperature;

    public DataCenter(int temperature) {
        this.temperature = temperature;

        while(this.temperature > 20) {
            this.refroidir();
        }
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
