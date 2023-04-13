package org.example.dao;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DAOFactory {
    static final private int BASEDONNEES = 1;
    static SessionFactory sessionFactory;

    public static IVoitureDao getDAO(){
        if(BASEDONNEES==1) {
            return new VoitureDAOPGimpl();
        } else {
            return null;
        }
    }

    public static SessionFactory getSessionFactory(){
        if(sessionFactory==null) {
            if (BASEDONNEES == 1) {
                sessionFactory = new Configuration()
                        .configure("hibernate-cfg.xml")
                        .buildSessionFactory();
            }
        }
        return sessionFactory;
    }
}
