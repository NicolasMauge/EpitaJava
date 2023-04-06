package com.example.Ex5ERP.application;


public class Adresse {
    private String rue;
    private String code;
    private String ville;

    public Adresse(String rue, String code, String ville) {
        this.rue = rue;
        this.code = code;
        this.ville = ville;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }
}
