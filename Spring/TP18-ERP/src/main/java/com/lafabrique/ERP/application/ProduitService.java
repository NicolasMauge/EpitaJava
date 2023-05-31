package com.lafabrique.ERP.application;

import com.lafabrique.ERP.domaine.Produit;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface ProduitService {
    void create(Produit produit);

    Produit findById(Long id);

    List<Produit> findAll();

    List<Produit> findAll(Sort sort);
}
