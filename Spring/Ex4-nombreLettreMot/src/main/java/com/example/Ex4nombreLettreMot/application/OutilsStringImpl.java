package com.example.Ex4nombreLettreMot.application;

import org.springframework.stereotype.Service;

@Service
public class OutilsStringImpl implements OutilsString {
    @Override
    public int nombreLettresMot(String mot) {
        return mot.length();
    }
}
