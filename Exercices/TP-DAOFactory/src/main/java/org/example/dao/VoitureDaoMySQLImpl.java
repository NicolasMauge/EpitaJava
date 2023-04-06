package org.example.dao;

import org.example.domaine.Voiture;

public class VoitureDaoMySQLImpl implements IVoitureDao {
    @Override
    public void createVoiture(Voiture v) {
        System.out.println("(Persistence) Enregistrement");
    }
}
