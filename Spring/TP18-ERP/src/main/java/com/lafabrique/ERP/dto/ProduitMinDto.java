package com.lafabrique.ERP.dto;

import java.math.BigDecimal;

public class ProduitMinDto {
    private Long id;
    private String name;
    private String photo;
    private BigDecimal price;
    private BigDecimal priceVAT;

    public ProduitMinDto(Long id, String name, String photo, BigDecimal price, BigDecimal priceVAT) {
        this.id = id;
        this.name = name;
        this.photo = photo;
        this.price = price;
        this.priceVAT = priceVAT;
    }

    public ProduitMinDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPriceVAT() {
        return priceVAT;
    }

    public void setPriceVAT(BigDecimal priceVAT) {
        this.priceVAT = priceVAT;
    }
}
