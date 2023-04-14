package org.example.infrastructure;

import org.example.domaine.Voiture;

import java.util.List;

public interface VoitureDAO {
    void create(Voiture v);

    Voiture find(long id);

    List<Voiture> findAll();

    List<Voiture> findByModele(String modele);
}
