package org.example.infrastructure;

import org.example.domaine.Voiture;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.persistence.Query;
import java.util.List;

public class VoitureDAOImpl implements VoitureDAO {
    SessionFactory sessionFactory = DAOFactory.getSessionFactory();
    @Override
    public void create(Voiture voiture) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.persist(voiture);
        session.getTransaction();
        session.close();
    }

    @Override
    public Voiture find(long id) {
        Session session = sessionFactory.openSession();
        Voiture voiture = session.find(Voiture.class, id);
        session.close();
        return voiture;
    }

    @Override
    public List<Voiture> findAll() {
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("select v from Voiture v");
        List<Voiture> list = query.getResultList();
        session.close();
        return list;
    }

    @Override
    public List<Voiture> findByModele(String modele) {
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("select v from Voiture v where v.modele = :nomModele");
        query.setParameter("nomModele", modele);
        List<Voiture> list = query.getResultList();
        session.close();
        return list;
    }
}
