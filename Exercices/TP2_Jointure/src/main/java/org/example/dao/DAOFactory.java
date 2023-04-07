package org.example.dao;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DAOFactory {
    static SessionFactory sf;

    public static IClientDAO getFactory() {
        return new ClientDAOImpl();
    }

    public static SessionFactory getSession() {
        if (sf == null) {
            sf = new Configuration().configure("hibernate-cfg.xml").buildSessionFactory();
        }
        return sf;
    }
}
