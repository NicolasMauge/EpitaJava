package com.example.controller;

import com.example.service.VoitureService;
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
        return service.reparerVoiture();
    }

    @GetMapping("/all")
    public String findAllVoiture(){
        return "toutes les voitures";
    }
}
