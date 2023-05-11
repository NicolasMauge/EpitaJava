package com.lafabrique.ERP.domaine;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Devis {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Client client;

    @OneToMany(cascade = CascadeType.PERSIST)
    private Set<LigneDevis> ligneDevis;

    public Devis(Client client, Set<LigneDevis> ligneDevis) {
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
}
