package com.lafabrique.ERP.exposition;

import com.lafabrique.ERP.application.ProduitService;
import com.lafabrique.ERP.domaine.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class ProduitController {
    @Autowired
    ProduitService produitService;

    @PostMapping("/produit")
    void createProduit(@RequestBody Produit produit){
        produitService.create(produit);
    }

    @GetMapping("/produit/{id}")
    Produit findProduitById(@PathVariable("id") Long id){
        return produitService.findById(id);
    }
}
