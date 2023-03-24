package com.bnpparibas.epita.poo.exo6;

import com.bnpparibas.epita.poo.exo6.math.Math;
import com.bnpparibas.epita.poo.exo6.math.FactorielleException;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(Math.factorielle(-10));
        } catch (FactorielleException e) {
            e.printStackTrace();
        }
    }
}
