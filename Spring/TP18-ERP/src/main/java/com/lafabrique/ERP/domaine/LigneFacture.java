package com.lafabrique.ERP.domaine;

import javax.persistence.*;

@Entity
public class LigneFacture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Produit produit;
    private long quantity;

    public LigneFacture(Produit produit, long quantity) {
        this.produit = produit;
        this.quantity = quantity;
    }

    public LigneFacture() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }
}
