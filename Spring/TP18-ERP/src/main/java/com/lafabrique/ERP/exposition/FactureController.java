package com.lafabrique.ERP.exposition;

import com.lafabrique.ERP.application.FactureService;
import com.lafabrique.ERP.domaine.Facture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class FactureController {
    @Autowired
    FactureService factureService;



    @PostMapping("/facture")
    void createFacture(@RequestBody Facture facture) {
        factureService.create(facture);
    }
}
