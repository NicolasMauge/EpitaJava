package com.lafabrique.ERP.domaine;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Facture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Client client;
    @OneToMany
    private Set<LigneFacture> ligneFacture;

    public Facture(Client client, Set<LigneFacture> ligneFacture) {
        this.client = client;
        this.ligneFacture = ligneFacture;
    }

    public Facture() {
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

    public Set<LigneFacture> getLigneFacture() {
        return ligneFacture;
    }

    public void setLigneFacture(Set<LigneFacture> ligneFacture) {
        this.ligneFacture = ligneFacture;
    }
}
