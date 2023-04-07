package com.epita.lafabrique.Exercice2;

public class Contacts {
    private String numeroDeTelephone[];
    private String mail;

    public Contacts(String[] numeroDeTelephone, String mail) {
        this.numeroDeTelephone = numeroDeTelephone;
        this.mail = mail;
    }

    public String[] getNumeroDeTelephone() {
        return numeroDeTelephone;
    }

    public void setNumeroDeTelephone(String[] numeroDeTelephone) {
        this.numeroDeTelephone = numeroDeTelephone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
