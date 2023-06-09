package com.training.b_methodreferences.tp1;

import java.util.Arrays;
import java.util.List;

/**
 * Exercice :
 *
 * <pre>
 * - Afficher l'ensemble des éléments de la liste de fruits en utilisant une
 * expression lambda
 * - Afficher l'ensemble des éléments de la liste en utilisant une référence de méthode
 * - Afficher l'ensemble des éléments de la liste en les triant alphabétiquement
 * </pre>
 */
public class InstanceMethodReference {

    public static void main(final String[] args) {
        final List<String> fruits = Arrays.asList("Orange", "Apple", "Banana");
        // Display with lambda expression

        fruits.forEach(x -> System.out.println(x));

        System.out.println("-------------------");
        // Display with method reference

        fruits.forEach(System.out::println);

        // sort

        fruits.sort((String a, String b) -> a.compareToIgnoreCase(b));

        System.out.println(fruits);
    }
}
