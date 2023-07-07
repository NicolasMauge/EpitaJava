package com.example.domaine;

import jdk.jshell.execution.Util;

import javax.persistence.*;
import java.util.List;

@Entity
public class SelectedMedia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Media media;

    @OneToOne
    private Utilisateur utilisateur;

    @OneToOne
    private ListDeFilms listDeFilms;

    @OneToMany(cascade = CascadeType.ALL)
    private List<MyTag> tagList;

    public SelectedMedia() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Media getMedia() {
        return media;
    }

    public void setMedia(Media media) {
        this.media = media;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public ListDeFilms getListDeFilms() {
        return listDeFilms;
    }

    public void setListDeFilms(ListDeFilms listDeFilms) {
        this.listDeFilms = listDeFilms;
    }

    public List<MyTag> getTagList() {
        return tagList;
    }

    public void setTagList(List<MyTag> tagList) {
        this.tagList = tagList;
    }
}
