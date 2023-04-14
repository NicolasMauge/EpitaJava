package org.example.infrastructure;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DAOFactory {
    public static SessionFactory sf;

    public static VoitureDAOImpl getDAO(){
        return new VoitureDAOImpl();
    }

    public static SessionFactory getSessionFactory(){
        if(sf==null) {
            return new Configuration().configure("hibernate-cfg.xml").buildSessionFactory();
        } else {
            return sf;
        }
    }
}
