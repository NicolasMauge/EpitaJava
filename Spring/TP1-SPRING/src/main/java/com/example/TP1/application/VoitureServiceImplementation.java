package com.example.TP1.application;

import org.springframework.stereotype.Service;

@Service
public class VoitureServiceImplementation implements VoitureService {
    @Override
    public String reparerVoiture() {
        return "Ok";
    }
}
