package com.bnpparibas.epita.poo.exo3.building;

public class DataCenter implements AvecClimatisation {
    private int temperature;

    public DataCenter(int temperature) {
        this.temperature = temperature;

        while(this.temperature > 20) {
            System.out.println("Le Datacenter est trop chaud : on le refroidit");
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
