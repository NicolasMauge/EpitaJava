package com.lafabrique.application;

import com.lafabrique.domaine.Voiture;
import org.springframework.stereotype.Service;

@Service
public class VoitureServiceImpl implements VoitureService {
    @Override
    public void create(Voiture v) {
        System.out.println("dans service");
    }
}
