package com.example.Exercice1_random.exposition;

import com.example.Exercice1_random.application.RandomValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dice")
public class RandomController {

    @Autowired
    RandomValue service;
    @GetMapping
    public int getRandom(){
        return service.getRandom();
    }
}
