package com.epita.voyageur;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Queue<Voyageur> avion = new PriorityQueue<>(new VoyageurComparator());

        avion.add(new Voyageur(123, "50A", "Durant", ClasseVoyageur.Business));
        avion.add(new Voyageur(124, "80B", "Michel", ClasseVoyageur.Economique));
        avion.add(new Voyageur(125, "41E", "Sylvain", ClasseVoyageur.Premiere));
        avion.add(new Voyageur(126, "40A", "Duval", ClasseVoyageur.Premiere));

        System.out.println(avion);

        System.out.println("Premier appelé : " + avion.poll());
        System.out.println("Deuxième appelé : " + avion.poll());
    }

    static class VoyageurComparator implements Comparator<Voyageur> {
        @Override
        public int compare(Voyageur voyageur1, Voyageur voyageur2) {
            int compareClasse = voyageur1.getClasse().compareTo(voyageur2.getClasse());
            if(compareClasse == 0) {
                return voyageur1.getNumeroSiege().compareTo(voyageur2.getNumeroSiege());
            } else {
                return compareClasse;
            }
        }
    }
}
