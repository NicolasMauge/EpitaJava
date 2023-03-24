package com.bnpparibas.epita.poo.exo2;
import com.bnpparibas.epita.poo.exo2.vehicules.Vehicule;
import com.bnpparibas.epita.poo.exo2.vehicules.Velo;
import com.bnpparibas.epita.poo.exo2.vehicules.Train;

public class Main {
    public static void main(String[] args) {
        Vehicule coccinelle = new Vehicule(3);
        System.out.println(coccinelle.direBonjour());

        Velo bycl = new Velo();
        System.out.println(bycl.direBonjour());

        Train tr = new Train();
        System.out.println(tr);
    }
}
