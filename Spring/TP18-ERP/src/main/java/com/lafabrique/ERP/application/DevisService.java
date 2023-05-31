package com.lafabrique.ERP.application;

import com.lafabrique.ERP.domaine.Devis;

import java.util.List;

public interface DevisService {
    void create(Devis devise);

    Devis findById(Long id);

    List<Devis> findAll();
}
