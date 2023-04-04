package com.epita.lafabrique.Exercice2;

public class RaisonDeVenir {
    private Evenement evenement;

    private String Diagnostic;

    public RaisonDeVenir(Evenement evenement, String diagnostic) {
        this.evenement = evenement;
        Diagnostic = diagnostic;
    }

    public Evenement getEvenement() {
        return evenement;
    }

    public void setEvenement(Evenement evenement) {
        this.evenement = evenement;
    }

    public String getDiagnostic() {
        return Diagnostic;
    }

    public void setDiagnostic(String diagnostic) {
        Diagnostic = diagnostic;
    }
}
