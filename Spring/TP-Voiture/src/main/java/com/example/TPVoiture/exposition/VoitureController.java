package com.example.TPVoiture.exposition;

import com.example.TPVoiture.application.Voiture;
import com.example.TPVoiture.application.VoitureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/voitureController")
public class VoitureController {
    @Autowired
    VoitureService service;

    @GetMapping("/find-{id}")
    public Voiture findVoiture(@PathVariable("id") int idVoiture) {
        return service.findVoiture(idVoiture);
    }

    @PostMapping
    public String findAllVoiture(){
        return "toutes les voitures";
    }
}
