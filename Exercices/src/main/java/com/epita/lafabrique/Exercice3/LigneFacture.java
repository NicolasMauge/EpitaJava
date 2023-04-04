package com.epita.lafabrique.Exercice3;

public class LigneFacture {
    private Produit produit;
    private int quantite;
    private int montant;

    public LigneFacture(Produit produit, int quantite, int montant) {
        this.produit = produit;
        this.quantite = quantite;
        this.montant = montant;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public int getMontant() {
        return montant;
    }

    public void setMontant(int montant) {
        this.montant = montant;
    }
}
