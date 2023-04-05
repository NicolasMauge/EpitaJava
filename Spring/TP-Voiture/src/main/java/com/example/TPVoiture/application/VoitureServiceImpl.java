package com.example.TPVoiture.application;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VoitureServiceImpl implements VoitureService {
    @Override
    public String reparerVoiture() {
        return "ok";
    }

    @Override
    public Voiture findVoiture(int id) {
        List<String> equipement = new ArrayList<>();
        equipement.add("clim");
        equipement.add("toit ouvrant");

        return new Voiture(id, "blanche", equipement, "twingo");
    }
}
