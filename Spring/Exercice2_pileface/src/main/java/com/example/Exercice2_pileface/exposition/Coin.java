package com.example.Exercice2_pileface.exposition;

import com.example.Exercice2_pileface.application.Pileface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coin")
public class Coin {
    @Autowired
    Pileface pileface;

    @GetMapping
    public String pileOuFace(){
        return pileface.getPileFace();
    }
}
