package com.bnpparibas.epita.poo.exo5.singleton;

public class MySingleton {
    private static MySingleton instance;
    private final String titre;

    public String getTitre() {
        return titre;
    }

    private MySingleton(String titre) {
        this.titre = titre;
    }
    public static MySingleton getInstance(String titre) {
        if(instance == null) {
            instance = new MySingleton(titre);
        }
        return instance;
    }

}
