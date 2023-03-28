package com.epita.enumerations;

import com.epita.enumerations.bibl.JourDeLaSemaine;

public class Main {
    public static void main(String[] args) {
        JourDeLaSemaine jour = JourDeLaSemaine.Dimanche;

        aff(jour.getSmiley());
        aff(""+jour.getJourWeekEnd());

        for(int i = 0; i< JourDeLaSemaine.values().length; i++){
            aff(JourDeLaSemaine.values()[i] + " : "+
                    JourDeLaSemaine.values()[i].getSmiley()+ ", c'est le week-end : "+
                    (JourDeLaSemaine.values()[i].getJourWeekEnd() ? "Oui" : "Non"));
        }

        aff(String.valueOf(JourDeLaSemaine.Jeudi.compareTo(JourDeLaSemaine.Samedi)));
    }

    static public void aff(String message) {
        System.out.println(message);
    }
}
