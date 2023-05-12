package com.lafabrique.ERP.domaine;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
public class Devis {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "dateDevis")
    private LocalDate date;
    // création devis -> création client
    // modification client -> modification en base
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Client client;

    // on se dit que les lignes de devis n'ont pas de sens seules
    @OneToMany(cascade = CascadeType.ALL)
    private Set<LigneDevis> ligneDevis;

    public Devis(LocalDate date, Client client, Set<LigneDevis> ligneDevis) {
        this.date = date;
        this.client = client;
        this.ligneDevis = ligneDevis;
    }

    public Devis() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Set<LigneDevis> getLigneDevis() {
        return ligneDevis;
    }

    public void setLigneDevis(Set<LigneDevis> ligneDevis) {
        this.ligneDevis = ligneDevis;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
