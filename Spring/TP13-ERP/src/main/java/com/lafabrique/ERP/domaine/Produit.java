package com.lafabrique.ERP.domaine;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int price;
    private int priceVAT;
    private String description;
    private String photo;

    public Produit(String name, int price, int priceVAT, String description, String photo) {
        this.name = name;
        this.price = price;
        this.priceVAT = priceVAT;
        this.description = description;
        this.photo = photo;
    }

    public Produit() {
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPriceVAT() {
        return priceVAT;
    }

    public void setPriceVAT(int priceVAT) {
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
