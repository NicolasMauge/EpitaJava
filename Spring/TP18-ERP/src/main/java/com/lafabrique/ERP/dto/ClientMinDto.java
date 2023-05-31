package com.lafabrique.ERP.dto;

public class ClientMinDto {
    private Long id;
    private String firstname;
    private String surname;

    private String avatar;

    public ClientMinDto(Long id, String firstname, String surname, String avatar) {
        this.id = id;
        this.firstname = firstname;
        this.surname = surname;
        this.avatar = avatar;
    }

    public ClientMinDto() {
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

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}
