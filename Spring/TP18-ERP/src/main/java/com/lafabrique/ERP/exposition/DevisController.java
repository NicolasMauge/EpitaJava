package com.lafabrique.ERP.exposition;

import com.lafabrique.ERP.application.DevisServiceImpl;
import com.lafabrique.ERP.domaine.Devis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class DevisController {
    @Autowired
    DevisServiceImpl devisService;

    @PostMapping("/devis")
    void createDevis(@RequestBody Devis devis) {
        devisService.create(devis);
    }
}
