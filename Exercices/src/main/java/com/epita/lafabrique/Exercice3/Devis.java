package com.epita.lafabrique.Exercice3;

import java.time.LocalDate;

public class Devis {
    private LocalDate dateDeCreation;
    private Client client;
    private LigneDevis[] ligneDevis;

    public Devis(LocalDate dateDeCreation, Client client, LigneDevis[] ligneDevis) {
        this.dateDeCreation = dateDeCreation;
        this.client = client;
        this.ligneDevis = ligneDevis;
    }

    public LocalDate getDateDeCreation() {
        return dateDeCreation;
    }

    public void setDateDeCreation(LocalDate dateDeCreation) {
        this.dateDeCreation = dateDeCreation;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public LigneDevis[] getLigneDevis() {
        return ligneDevis;
    }

    public void setLigneDevis(LigneDevis[] ligneDevis) {
        this.ligneDevis = ligneDevis;
    }
}
