package com.bnpparibas.epita.poo.exo6.math;

public class FactorielleException extends Exception {
    public FactorielleException() {
        super("Cette méthode ne permet pas de calculer des factorielles de nombres supérieurs à 39");
    }

    public FactorielleException(String message) {
        super(message);
    }

    public FactorielleException(int a) {
        super("Exception pour le chiffre " + a);
    }


}
