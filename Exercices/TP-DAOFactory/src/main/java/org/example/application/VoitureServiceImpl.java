package org.example.application;

import org.example.dao.DAOFactory;
import org.example.dao.IVoitureDao;
import org.example.domaine.Voiture;

public class VoitureServiceImpl implements IVoitureService {
    IVoitureDao dao = DAOFactory.getDAO();
    @Override
    public void createVoiture(Voiture v) {
        System.out.println("(Service) Création d'une voiture");
        dao.createVoiture(v);
    }


}
