package com.epita.lafabrique.Exercice2;

public class Antecedents {
    private String[] antecedentsMedicaux;
    private String[] antecedentsFamiliaux;
    private String[] antecedentsChirurgicaux;
    private String[] traitementsEnCours;
    private String[] allergies;

    private int nombreGrossesses;

    public Antecedents(String[] antecedentsMedicaux, String[] antecedentsFamiliaux, String[] antecedentsChirurgicaux, String[] traitementsEnCours, String[] allergies, int nombreGrossesses) {
        this.antecedentsMedicaux = antecedentsMedicaux;
        this.antecedentsFamiliaux = antecedentsFamiliaux;
        this.antecedentsChirurgicaux = antecedentsChirurgicaux;
        this.traitementsEnCours = traitementsEnCours;
        this.allergies = allergies;
        this.nombreGrossesses = nombreGrossesses;
    }

    public String[] getAntecedentsMedicaux() {
        return antecedentsMedicaux;
    }

    public void setAntecedentsMedicaux(String[] antecedentsMedicaux) {
        this.antecedentsMedicaux = antecedentsMedicaux;
    }

    public String[] getAntecedentsFamiliaux() {
        return antecedentsFamiliaux;
    }

    public void setAntecedentsFamiliaux(String[] antecedentsFamiliaux) {
        this.antecedentsFamiliaux = antecedentsFamiliaux;
    }

    public String[] getAntecedentsChirurgicaux() {
        return antecedentsChirurgicaux;
    }

    public void setAntecedentsChirurgicaux(String[] antecedentsChirurgicaux) {
        this.antecedentsChirurgicaux = antecedentsChirurgicaux;
    }

    public String[] getTraitementsEnCours() {
        return traitementsEnCours;
    }

    public void setTraitementsEnCours(String[] traitementsEnCours) {
        this.traitementsEnCours = traitementsEnCours;
    }

    public String[] getAllergies() {
        return allergies;
    }

    public void setAllergies(String[] allergies) {
        this.allergies = allergies;
    }

    public int getNombreGrossesses() {
        return nombreGrossesses;
    }

    public void setNombreGrossesses(int nombreGrossesses) {
        this.nombreGrossesses = nombreGrossesses;
    }
}
