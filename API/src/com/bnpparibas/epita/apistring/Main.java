package com.bnpparibas.epita.apistring;

import com.bnpparibas.epita.apistring.lib.StringManipulation;

public class Main {
    public static void main(String[] args) {
        String chaine = "Un exemple de chaîne de caractère pour tester les méthodes.";

        aff(chaine.toUpperCase());

        aff(String.valueOf(StringManipulation.nbOccChar(chaine, 'a')));

        aff(StringManipulation.replaceCharByChar(chaine, 'a', '4'));
        aff(StringManipulation.replaceCharByChar(chaine, 'c', 'u'));
        aff(StringManipulation.replaceCharByChar(chaine, 'e', '3'));

    }

    static public void aff(String message) {
        System.out.println(message);
    }
}
