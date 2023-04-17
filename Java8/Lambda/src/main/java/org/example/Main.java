package org.example;

public class Main {
    public static void main(String[] args) {
        // Classe anonyme
        Transformer transformer = new Transformer() {
            @Override
            public String transformer(String chaine) {
                return chaine.toUpperCase();
            }
        };

        // Lambda
        Transformer lowerCase = (String chaine) -> { return chaine.toLowerCase(); };

        String result = lowerCase.transformer("Bonjour");

        System.out.println(result);
    }
}