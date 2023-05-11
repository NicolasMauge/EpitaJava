package com.lafabrique.ERP.domaine;

import java.io.Serializable;

public class StockMessage implements Serializable {
    private Long id;
    private Produit produit;
    private int quantity;

    public StockMessage(Produit produit, int quantity) {
        this.produit = produit;
        this.quantity = quantity;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
