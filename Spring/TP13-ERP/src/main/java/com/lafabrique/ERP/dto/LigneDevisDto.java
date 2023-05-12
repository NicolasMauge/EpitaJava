package com.lafabrique.ERP.dto;

import com.lafabrique.ERP.domaine.Produit;

import java.math.BigDecimal;

public class LigneDevisDto {
    private Long id;
    private ProduitDetailDto produitDetailDto;
    private long quantity;
    private BigDecimal montant;
    private BigDecimal remise;

    public LigneDevisDto(Long id, ProduitDetailDto produitDetailDto, long quantity, BigDecimal montant, BigDecimal remise) {
        this.id = id;
        this.produitDetailDto = produitDetailDto;
        this.quantity = quantity;
        this.montant = montant;
        this.remise = remise;
    }

    public LigneDevisDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ProduitDetailDto getProduitDetailDto() {
        return produitDetailDto;
    }

    public void setProduitDetailDto(ProduitDetailDto produitDetailDto) {
        this.produitDetailDto = produitDetailDto;
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

    public BigDecimal getMontant() {
        return montant;
    }

    public void setMontant(BigDecimal montant) {
        this.montant = montant;
    }
}
