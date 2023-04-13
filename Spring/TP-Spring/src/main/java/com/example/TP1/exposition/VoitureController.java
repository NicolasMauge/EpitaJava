package com.example.TP1.exposition;

import com.example.TP1.application.VoitureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/voitureController")
public class VoitureController {

    @Autowired
    VoitureService service;

    @GetMapping("/find")
    public String findVoiture(){
        // qui demande ça ?
        // est-ce que tu es authentifié ?
        // est-ce que ce n'est pas une attaque ?
        // la donnée demandée est-elle
        return service.reparerVoiture();
    }

    @GetMapping("/all")
    public String findAllVoiture(){
        return "toutes les voitures";
    }
}
