package com.lafabrique.ERP.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;

public class ClientDetailDto {
    private Long id;

    private String firstname;
    private String surname;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate birthday;

    private String avatar;

    @JsonProperty("adresse")
    private AddressDto addressDto;

    public ClientDetailDto(Long id, String firstname, String surname, LocalDate birthday, String avatar, AddressDto addressDto) {
        this.id = id;
        this.firstname = firstname;
        this.surname = surname;
        this.birthday = birthday;
        this.avatar = avatar;
        this.addressDto = addressDto;
    }

    public ClientDetailDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public AddressDto getAdresseDto() {
        return addressDto;
    }

    public void setAdresseDto(AddressDto addressDto) {
        this.addressDto = addressDto;
    }
}
