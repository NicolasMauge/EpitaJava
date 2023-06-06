package org.example.dto;

import com.opencsv.bean.CsvBindByName;

import java.math.BigDecimal;

public class ProduitDetailsDto {
    @CsvBindByName
    private String nom;

    @CsvBindByName(column="photo")
    private String photoUrl;

    @CsvBindByName
    private BigDecimal prixHT;

    @CsvBindByName
    private String description;

    public ProduitDetailsDto(String nom, String photoUrl, BigDecimal prixHT, String description) {
        this.nom = nom;
        this.photoUrl = photoUrl;
        this.prixHT = prixHT;
        this.description = description;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public BigDecimal getPrixHT() {
        return prixHT;
    }

    public void setPrixHT(BigDecimal prixHT) {
        this.prixHT = prixHT;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
