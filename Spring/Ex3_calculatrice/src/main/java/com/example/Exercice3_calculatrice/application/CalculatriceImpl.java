package com.example.Exercice3_calculatrice.application;

import org.springframework.stereotype.Service;

@Service
public class CalculatriceImpl implements Calculatrice {
    @Override
    public int additionne(int a, int b) {
        return a + b;
    }

    @Override
    public int soustraction(int a, int b) {
        return a - b;
    }

    @Override
    public int multiplication(int a, int b) {
        return a * b;
    }

    @Override
    public double division(int a, int b) {
        return (double) a / (double) b;
    }

    @Override
    public double square(int a) {
        return a * a;
    }
}
