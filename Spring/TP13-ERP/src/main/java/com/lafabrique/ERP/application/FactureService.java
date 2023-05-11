package com.lafabrique.ERP.application;

import com.lafabrique.ERP.domaine.Facture;

import java.util.List;

public interface FactureService {
    List<Facture> findAll();

    void create(Facture facture);

    Facture findById(Long id);
}
