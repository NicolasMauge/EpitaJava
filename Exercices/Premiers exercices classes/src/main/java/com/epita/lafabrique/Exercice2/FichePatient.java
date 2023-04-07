package com.epita.lafabrique.Exercice2;

public class FichePatient {
    private Civilite civilite;
    private String nom;
    private String prenom;
    private Sexe sexe;
    private String numeroDeSS;
    private Mutuelle mutuelle;
    private Profession profession;
    private Adresse adresse;

    private RaisonDeVenir raisonDeVenir;

    private String medecinTraitant;

    private String adressePar;

    public FichePatient(Civilite civilite, String nom, String prenom, Sexe sexe, String numeroDeSS, Mutuelle mutuelle, Profession profession, Adresse adresse, RaisonDeVenir raisonDeVenir, String medecinTraitant, String adressePar) {
        this.civilite = civilite;
        this.nom = nom;
        this.prenom = prenom;
        this.sexe = sexe;
        this.numeroDeSS = numeroDeSS;
        this.mutuelle = mutuelle;
        this.profession = profession;
        this.adresse = adresse;
        this.raisonDeVenir = raisonDeVenir;
        this.medecinTraitant = medecinTraitant;
        this.adressePar = adressePar;
    }

    public Civilite getCivilite() {
        return civilite;
    }

    public void setCivilite(Civilite civilite) {
        this.civilite = civilite;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Sexe getSexe() {
        return sexe;
    }

    public void setSexe(Sexe sexe) {
        this.sexe = sexe;
    }

    public String getNumeroDeSS() {
        return numeroDeSS;
    }

    public void setNumeroDeSS(String numeroDeSS) {
        this.numeroDeSS = numeroDeSS;
    }

    public Mutuelle getMutuelle() {
        return mutuelle;
    }

    public void setMutuelle(Mutuelle mutuelle) {
        this.mutuelle = mutuelle;
    }

    public Profession getProfession() {
        return profession;
    }

    public void setProfession(Profession profession) {
        this.profession = profession;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public RaisonDeVenir getRaisonDeVenir() {
        return raisonDeVenir;
    }

    public void setRaisonDeVenir(RaisonDeVenir raisonDeVenir) {
        this.raisonDeVenir = raisonDeVenir;
    }

    public String getMedecinTraitant() {
        return medecinTraitant;
    }

    public void setMedecinTraitant(String medecinTraitant) {
        this.medecinTraitant = medecinTraitant;
    }

    public String getAdressePar() {
        return adressePar;
    }

    public void setAdressePar(String adressePar) {
        this.adressePar = adressePar;
    }
}
