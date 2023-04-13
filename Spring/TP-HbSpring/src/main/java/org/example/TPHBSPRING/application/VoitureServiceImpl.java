package org.example.TPHBSPRING.application;

import org.example.TPHBSPRING.domaine.Voiture;
import org.example.TPHBSPRING.infrastructure.VoitureDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VoitureServiceImpl implements VoitureService {
    @Autowired
    VoitureDAO dao;

    @Override
    public Voiture findById(long id) {
        return dao.findById(id);
    }

    @Override
    public List<Voiture> findAll() {
        return dao.findAll();

    }

    @Override
    public void create(Voiture voiture) {
        dao.create(voiture);
    }
}
