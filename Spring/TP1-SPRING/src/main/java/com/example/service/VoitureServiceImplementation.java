package com.example.service;

import org.springframework.stereotype.Service;

@Service
public class VoitureServiceImplementation implements VoitureService {
    @Override
    public String reparerVoiture() {
        return "Ok";
    }
}
