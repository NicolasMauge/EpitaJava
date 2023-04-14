package org.example;

import org.example.application.IVoitureService;
import org.example.application.VoitureServiceImpl;
import org.example.domaine.Voiture;

public class Main {
    public static void main(String[] args) {
        IVoitureService service = new VoitureServiceImpl();
        Voiture v = new Voiture("rouge", "mercedes");
        service.createVoiture(v);

        Voiture v2 = service.findById(1);

        System.out.println(v2.getCouleur() + " "+ v2.getModele());
    }
}