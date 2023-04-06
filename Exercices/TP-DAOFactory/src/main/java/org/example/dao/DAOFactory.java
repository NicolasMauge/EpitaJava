package org.example.dao;

public class DAOFactory {
    static final private int BASEDONNEES = 1;
    public static IVoitureDao getDAO(){
        if(BASEDONNEES==1) {
            return new VoitureDaoMySQLImpl();
        } else {
            return null;
        }
    }
}
