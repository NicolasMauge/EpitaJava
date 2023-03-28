package com.epita.apicollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;
import java.util.Set;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        // liste sans triée a priori
        List<String> listString = new ArrayList<>();

        listString.add("Z-Test1");
        listString.add("B-Test2");
        listString.add("A-Test3");
        listString.add("U-Test4");

        showElements(listString);

        Collections.sort(listString);

        System.out.println();

        showElements(listString);

        // liste triée
        Set<String> listTriee = new TreeSet<>();

        listTriee.add("Z-ListTr 1");
        listTriee.add("A-ListTr 2");
        listTriee.add("U-ListTr 3");
        listTriee.add("B-ListTr 4");
        listTriee.add("G-ListTr 5");
        listTriee.add("B-ListTr 4");

        showElements(listTriee);

        // tableau à deux dimensions
        List<List<String>> listString2 = new ArrayList<>();

        // pour remplir la liste, il faudra remplir ligne par ligne
        // chaque ligne étant de type List<String>

    }

    static void showElements(Collection<String> list) {
        for(String element:list) {
            System.out.println(element);
        }
    }

    /*
    static void showElements(Set<String> list) {
        for(String element:list) {
            System.out.println(element);
        }
    }*/
}
