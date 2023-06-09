package org.example.dao;

import org.example.domaine.Voiture;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class VoitureDAOPGimpl implements IVoitureDao {
    SessionFactory sf = DAOFactory.getSessionFactory();

    @Override
    public void createVoiture(Voiture v) {
        Session s = sf.openSession();
        s.beginTransaction();
        s.persist(v);
        s.getTransaction().commit();
        s.close();
    }

    @Override
    public Voiture findById(int id) {
        Session s = sf.openSession();
        Voiture v = s.find(Voiture.class, id);
        s.close();
        return v;
    }
}
