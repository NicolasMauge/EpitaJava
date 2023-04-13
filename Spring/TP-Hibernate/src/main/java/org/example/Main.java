package org.example;

import org.example.application.ServiceFactory;
import org.example.application.VoitureService;
import org.example.application.VoitureServiceImpl;
import org.example.domaine.Voiture;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        VoitureService voitureService = ServiceFactory.getService();

        //Voiture voiture = new Voiture("twingo", "blanc");

        //voitureService.create(voiture);

        List<Voiture> voitures = voitureService.findByModele("Celica");

        for(Voiture voiture:voitures) {
            System.out.println(voiture.getId() + " " + voiture.getModele()+ " " + voiture.getCouleur());
        }
    }
}