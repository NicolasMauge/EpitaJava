package com.bnpparibas.epita.poo.exo6.math;

public class FactorielleExceptionMontantNegatif extends FactorielleException {
    public FactorielleExceptionMontantNegatif() {
        super("Le montant en entrée doit être positif");
    }
}
