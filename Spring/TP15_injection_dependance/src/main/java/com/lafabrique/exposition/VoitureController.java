package com.lafabrique.exposition;

import com.lafabrique.application.VoitureService;
import com.lafabrique.domaine.Voiture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("voiture")
public class VoitureController {
    VoitureService service;

    @Autowired
    public  VoitureController(VoitureService service) {
        this.service = service;
    }

    @GetMapping
    public void create() {
        Voiture v = new Voiture(3L, "rouge");
        service.create(v);
    }
}
