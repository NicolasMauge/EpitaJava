package com.bnpparibas.epita.enumerations;

import com.bnpparibas.epita.enumerations.bibl.jourDeLaSemaine;

public class Main {
    public static void main(String[] args) {
        jourDeLaSemaine jour = jourDeLaSemaine.Dimanche;

        aff(jour.getSmiley());
        aff(""+jour.getJourWeekEnd());

        for(int i=0;i<jourDeLaSemaine.values().length;i++){
            aff(jourDeLaSemaine.values()[i] + " : "+
                    jourDeLaSemaine.values()[i].getSmiley()+ ", c'est le week-end : "+
                    (jourDeLaSemaine.values()[i].getJourWeekEnd() ? "Oui" : "Non"));
        }
    }

    static public void aff(String message) {
        System.out.println(message);
    }
}
