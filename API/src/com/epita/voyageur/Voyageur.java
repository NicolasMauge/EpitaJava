package com.epita.voyageur;

public class Voyageur {
    private int numeroVoyageur;
    private String numeroSiege;
    private String name;
    private ClasseVoyageur classe;

    public Voyageur(int numeroVoyageur, String numeroSiege, String name, ClasseVoyageur classe) {
        this.numeroVoyageur = numeroVoyageur;
        this.numeroSiege = numeroSiege;
        this.name = name;
        this.classe = classe;
    }

    @Override
    public String toString() {
        return this.name + " : " + this.classe + " (Classe) "+ this.numeroSiege + " (Siege)";
    }

    public int getNumeroVoyageur() {
        return numeroVoyageur;
    }

    public void setNumeroVoyageur(int numeroVoyageur) {
        this.numeroVoyageur = numeroVoyageur;
    }

    public String getNumeroSiege() {
        return numeroSiege;
    }

    public void setNumeroSiege(String numeroSiege) {
        this.numeroSiege = numeroSiege;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ClasseVoyageur getClasse() {
        return classe;
    }

    public void setClasse(ClasseVoyageur classe) {
        this.classe = classe;
    }


}
