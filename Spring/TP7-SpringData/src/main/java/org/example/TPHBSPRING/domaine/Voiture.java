package org.example.TPHBSPRING.domaine;

import javax.persistence.*;

@Entity
@Table(name = "Voiture")
public class Voiture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String modele;
    private String couleur;

    public Voiture(String modele, String couleur) {
        this.modele = modele;
        this.couleur = couleur;
    }

    public Voiture() {
    }

    public Long getId() {
        return id;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }
}
