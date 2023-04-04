package com.epita.lafabrique.Exercice5;

public class NavigationGPS {
    private Itineraire itineraire;
    private MoyenDeTransport moyenDeTransport;

    public NavigationGPS(Itineraire itineraire, MoyenDeTransport moyenDeTransport) {
        this.itineraire = itineraire;
        this.moyenDeTransport = moyenDeTransport;
    }

    public void planificationItineraire(){

    }

    public Itineraire getItineraire() {
        return itineraire;
    }

    public void setItineraire(Itineraire itineraire) {
        this.itineraire = itineraire;
    }

    public MoyenDeTransport getMoyenDeTransport() {
        return moyenDeTransport;
    }

    public void setMoyenDeTransport(MoyenDeTransport moyenDeTransport) {
        this.moyenDeTransport = moyenDeTransport;
    }
}
