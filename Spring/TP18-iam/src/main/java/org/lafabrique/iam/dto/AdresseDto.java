package org.lafabrique.iam.dto;

public class AdresseDto {
    Long id;

    String postalCode;

    String city;

    String street;

    public AdresseDto(Long id, String postalCode, String city, String street) {
        this.id = id;
        this.postalCode = postalCode;
        this.city = city;
        this.street = street;
    }

    public AdresseDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
