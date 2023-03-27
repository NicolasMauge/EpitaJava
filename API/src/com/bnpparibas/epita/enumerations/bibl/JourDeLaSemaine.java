package com.bnpparibas.epita.enumerations.bibl;

public enum JourDeLaSemaine {
    Lundi(false, ":-("),
    Mercredi(false, ":-("),
    Mardi(false, ":-("),
    Jeudi(false, ":-("),
    Vendredi(false, ":-)"),
    Samedi(true, ":-)"),
    Dimanche(true, ":-)");

    private final boolean jourWeekEnd;
    private final String smiley;

    JourDeLaSemaine(boolean jourWeekEnd, String smiley) {
        this.jourWeekEnd = jourWeekEnd;
        this.smiley = smiley;
    }

    public boolean getJourWeekEnd() {
        return this.jourWeekEnd;
    }

    public String getSmiley() {
        return smiley;
    }
}
