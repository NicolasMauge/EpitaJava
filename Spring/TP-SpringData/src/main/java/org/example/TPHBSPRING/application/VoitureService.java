package org.example.TPHBSPRING.application;

import org.example.TPHBSPRING.domaine.Voiture;

import java.util.List;
import java.util.Optional;

public interface VoitureService {
    Voiture findById(Long id);

    List<Voiture> findAll();

    void create(Voiture voiture);

    List<Voiture> findByCouleur(String couleur);

    List<Voiture> findByModele(String modele);
}
