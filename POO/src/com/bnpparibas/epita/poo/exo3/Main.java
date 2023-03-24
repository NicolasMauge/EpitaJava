package com.bnpparibas.epita.poo.exo3;
import com.bnpparibas.epita.poo.exo3.building.Maison;
import com.bnpparibas.epita.poo.exo3.building.DataCenter;
public class Main {
    public static void main(String[] args) {
        Maison maMaison = new Maison(17);
        DataCenter monDatacenter = new DataCenter(30);

        maMaison.chauffer();
        System.out.println("Ma maison est à "+ maMaison.getTemperature());

        System.out.println("Mon datacenter est à "+ monDatacenter.getTemperature());
    }
}
