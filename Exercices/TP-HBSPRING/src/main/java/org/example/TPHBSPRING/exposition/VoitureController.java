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
    public Voiture findById(@PathVariable("id") long id){
        return service.findById(id);
    }

    @GetMapping("/all")
    public List<Voiture> findAll(){
        return service.findAll();
    }

    @PostMapping("/create")
    public void create(@RequestBody Voiture voiture){
        service.create(voiture);
    }


}
