package com.epita.lafabrique.Exercice5;

public class Itineraire {
    private String villeDepart;
    private String villeArrivee;
    private Boolean peage;

    public Itineraire(String villeDepart, String villeArrivee, Boolean peage) {
        this.villeDepart = villeDepart;
        this.villeArrivee = villeArrivee;
        this.peage = peage;
    }

    public String getVilleDepart() {
        return villeDepart;
    }

    public void setVilleDepart(String villeDepart) {
        this.villeDepart = villeDepart;
    }

    public String getVilleArrivee() {
        return villeArrivee;
    }

    public void setVilleArrivee(String villeArrivee) {
        this.villeArrivee = villeArrivee;
    }

    public Boolean getPeage() {
        return peage;
    }

    public void setPeage(Boolean peage) {
        this.peage = peage;
    }
}
