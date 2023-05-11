package com.lafabrique.ERP.exposition;

import com.lafabrique.ERP.application.ClientService;
import com.lafabrique.ERP.application.DevisServiceImpl;
import com.lafabrique.ERP.application.FactureService;
import com.lafabrique.ERP.application.ProduitService;
import com.lafabrique.ERP.domaine.Client;
import com.lafabrique.ERP.domaine.Devis;
import com.lafabrique.ERP.domaine.Facture;
import com.lafabrique.ERP.domaine.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ERPController {
    @Autowired
    ClientService clientService;

    @Autowired
    ProduitService produitService;

    @Autowired
    DevisServiceImpl devisService;

    @Autowired
    FactureService factureService;

    @PostMapping("/client")
    void createClient(@RequestBody Client client) {
        clientService.create(client);
    }

    @GetMapping("/clients/{id}")
    Client findClientById(@PathVariable("id") Long id) {
        return clientService.findById(id);
    }

    @GetMapping("/clients")
    List<Client> findAll(){
        return clientService.findAll();
    }


    @PostMapping("/produit")
    void createProduit(@RequestBody Produit produit){
        produitService.create(produit);
    }

    @GetMapping("/produit/{id}")
    Produit findProduitById(@PathVariable("id") Long id){
        return produitService.findById(id);
    }

    @PostMapping("/devis")
    void createDevis(@RequestBody Devis devis) {
        devisService.create(devis);
    }

    @PostMapping("/facture")
    void createFacture(@RequestBody Facture facture) {
        factureService.create(facture);
    }


}
