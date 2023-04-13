package org.example.dao;

import org.example.domaine.Client;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class ClientDAOImpl implements IClientDAO {
    SessionFactory sf = DAOFactory.getSession();

    @Override
    public void createClient(Client client) {
        Session s = sf.openSession();

        s.beginTransaction();
        s.persist(client);
        s.getTransaction();
        s.close();
    }
}
