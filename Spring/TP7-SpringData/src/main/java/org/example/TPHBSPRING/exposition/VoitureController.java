package org.example.TPHBSPRING.exposition;

import org.example.TPHBSPRING.application.VoitureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.example.TPHBSPRING.domaine.Voiture;

import java.util.List;

@RestController
@RequestMapping("/api/v1/cars")
public class VoitureController {
    @Autowired
    VoitureService service;

    @GetMapping("/{id}")
    public Voiture findById(@PathVariable("id") Long id) {
        return service.findById(id);
    }

    @GetMapping("/all")
    public List<Voiture> findAll() {
        return service.findAll();
    }

    @GetMapping("/modele/{modele}")
    public List<Voiture> findByModele(@PathVariable("modele") String modele) {
        return service.findByModele(modele);
    }

    @GetMapping("/couleur/{couleur}")
    public List<Voiture> findByCouleur(@PathVariable("couleur") String couleur) {
        return service.findByCouleur(couleur);
    }

    @PostMapping("/create")
    public void create(@RequestBody Voiture voiture) {
        service.create(voiture);
    }
}

