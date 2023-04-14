package org.example.TPHBSPRING.infrastructure;

import org.example.TPHBSPRING.domaine.Voiture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VoitureDAO extends JpaRepository<Voiture, Long> {
    List<Voiture> findByCouleur(String couleur);

    List<Voiture> findByModele(String modele);
}
