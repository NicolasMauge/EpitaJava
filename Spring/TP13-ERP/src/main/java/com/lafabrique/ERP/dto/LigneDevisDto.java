package com.lafabrique.ERP.dto;

import com.lafabrique.ERP.domaine.Produit;

public class LigneDevisDto {
    private Long id;
    private ProduitDetailDto produitDetailDto;
    private long quantity;

    public LigneDevisDto(Long id, ProduitDetailDto produitDetailDto, long quantity) {
        this.id = id;
        this.produitDetailDto = produitDetailDto;
        this.quantity = quantity;
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
}
