package org.example.TPHBSPRING.application;

import org.example.TPHBSPRING.domaine.Voiture;
import org.example.TPHBSPRING.infrastructure.VoitureDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

@Service
public class VoitureServiceImpl implements VoitureService {
    @Autowired
    VoitureDAO dao;

    @Override
    public Voiture findById(Long id) {
        //Optional<Voiture> optionalVoiture = dao.findById(id);
        //Voiture voiture = Optional.ofNullable(optionalVoiture.get()).orElseThrow(EntityNotFoundException::new);
        //return voiture;
        return dao.findById(id).get();
    }

    @Override
    public List<Voiture> findAll() {
        return dao.findAll();
    }

    @Override
    public void create(Voiture voiture) {
        dao.save(voiture);
    }

    @Override
    public List<Voiture> findByCouleur(String couleur) {
        return dao.findByCouleur(couleur);
    }

    @Override
    public List<Voiture> findByModele(String modele) {
        return dao.findByModele(modele);
    }
}
