package com.example.Exercice2_pileface.application;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class PilefaceImpl implements Pileface {
    @Override
    public String getPileFace() {
        Random r = new Random();
        return r.nextBoolean() ? "Pile":"Face";
    }
}
