package org.example.TPHBSPRING.infrastructure;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    public static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory(){
        if(sessionFactory==null){
            sessionFactory = new Configuration().configure("hibernate-cfg.xml").buildSessionFactory();
        }
        return sessionFactory;
    }
}
