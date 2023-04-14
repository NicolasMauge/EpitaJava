package org.example.TPHBSPRING.infrastructure;

import org.example.TPHBSPRING.domaine.Voiture;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import java.util.List;

@Repository
public class VoitureDAOImpl implements VoitureDAO {
    SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    @Override
    public Voiture findById(long id) {
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
    public void create(Voiture voiture) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.persist(voiture);
        session.getTransaction();
        session.close();
    }
}
