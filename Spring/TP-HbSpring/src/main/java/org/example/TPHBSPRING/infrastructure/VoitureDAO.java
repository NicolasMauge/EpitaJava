package org.example.TPHBSPRING.infrastructure;

import org.example.TPHBSPRING.domaine.Voiture;

import java.util.List;

public interface VoitureDAO {
    Voiture findById(long id);

    List<Voiture> findAll();

    void create(Voiture voiture);
}
