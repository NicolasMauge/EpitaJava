package com.example.Exercice1_random.application;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class RandomValueImpl implements RandomValue {
    @Override
    public int getRandom(){
        Random r = new Random();
        return r.nextInt((6))+1;
    }
}
