package org.example.TPHBSPRING.application;

import org.example.TPHBSPRING.domaine.Voiture;

import java.util.List;

public interface VoitureService {
    Voiture findById(long id);

    List<Voiture> findAll();

    void create(Voiture voiture);
}
