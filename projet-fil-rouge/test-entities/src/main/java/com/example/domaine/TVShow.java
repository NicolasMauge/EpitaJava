package com.example.domaine;


import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="tvshow")
public class TVShow extends Media {
    private String value;
    public TVShow() {
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
