package com.example.Ex4nombreLettreMot.exposition;

import com.example.Ex4nombreLettreMot.application.OutilsString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class OutilsStringController {
    @Autowired
    OutilsString outil;

    @GetMapping("/word/{mot}")
    public int getNombreLettresMot(@PathVariable("mot") String mot){
        return outil.nombreLettresMot(mot);
    }
}
