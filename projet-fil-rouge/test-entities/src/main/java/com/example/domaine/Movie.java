package com.example.domaine;


import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="movie")
public class Movie extends Media {
    private String value;

    public Movie() {
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
