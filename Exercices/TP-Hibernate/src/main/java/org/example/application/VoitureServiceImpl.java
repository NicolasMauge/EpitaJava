package org.example.application;

import org.example.domaine.Voiture;
import org.example.infrastructure.DAOFactory;
import org.example.infrastructure.VoitureDAO;

import java.util.List;

public class VoitureServiceImpl implements VoitureService {
    static VoitureDAO voitureDAO = DAOFactory.getDAO();
    @Override
    public void create(Voiture v) {
        voitureDAO.create(v);
    }

    @Override
    public Voiture find(long id) {
        return voitureDAO.find(id);
    }

    @Override
    public List<Voiture> findAll() {
        return voitureDAO.findAll();
    }

    @Override
    public List<Voiture> findByModele(String modele) {
        return voitureDAO.findByModele(modele);
    }
}
