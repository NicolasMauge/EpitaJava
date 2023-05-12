package com.lafabrique.ERP.dto;

import java.math.BigDecimal;

public class ProduitDetailDto {
    private Long id;
    private String name;
    private BigDecimal price;
    private BigDecimal priceVAT;
    private String description;
    private String photo;

    public ProduitDetailDto(Long id, String name, BigDecimal price, BigDecimal priceVAT, String description, String photo) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.priceVAT = priceVAT;
        this.description = description;
        this.photo = photo;
    }

    public ProduitDetailDto() {
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
