package com.lafabrique.ERP.domaine;

import javax.persistence.*;
import java.math.BigDecimal;
import java.text.Bidi;

@Entity
public class LigneDevis {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Produit produit;
    private long quantity;

    private BigDecimal remise;

    public LigneDevis(Produit produit, long quantity, BigDecimal remise) {
        this.produit = produit;
        this.quantity = quantity;
        this.remise = remise;
    }

    public LigneDevis() {
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

    public BigDecimal getRemise() {
        return remise;
    }

    public void setRemise(BigDecimal remise) {
        this.remise = remise;
    }
}
