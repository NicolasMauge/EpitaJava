package com.epita.lafabrique.Exercice3;

import java.time.LocalDate;

public class Facture {
    private LocalDate dateDeCreation;
    private Client client;
    private LigneFacture ligneFacture;
    private ModeReglement modeReglement;

    public Facture(LocalDate dateDeCreation, Client client, LigneFacture ligneFacture, ModeReglement modeReglement) {
        this.dateDeCreation = dateDeCreation;
        this.client = client;
        this.ligneFacture = ligneFacture;
        this.modeReglement = modeReglement;
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

    public LigneFacture getLigneFacture() {
        return ligneFacture;
    }

    public void setLigneFacture(LigneFacture ligneFacture) {
        this.ligneFacture = ligneFacture;
    }

    public ModeReglement getModeReglement() {
        return modeReglement;
    }

    public void setModeReglement(ModeReglement modeReglement) {
        this.modeReglement = modeReglement;
    }
}
