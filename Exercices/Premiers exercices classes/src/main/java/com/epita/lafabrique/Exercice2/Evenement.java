package com.epita.lafabrique.Exercice2;
import java.time.LocalDate;
public class Evenement {
    private LocalDate dateEvenement;
    private String evenement;

    public Evenement(LocalDate dateEvenement, String evenement) {
        this.dateEvenement = dateEvenement;
        this.evenement = evenement;
    }

    public LocalDate getDateEvenement() {
        return dateEvenement;
    }

    public void setDateEvenement(LocalDate dateEvenement) {
        this.dateEvenement = dateEvenement;
    }

    public String getEvenement() {
        return evenement;
    }

    public void setEvenement(String evenement) {
        this.evenement = evenement;
    }
}
