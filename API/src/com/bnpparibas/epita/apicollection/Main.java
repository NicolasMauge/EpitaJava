package com.bnpparibas.epita.apicollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> listString = new ArrayList<>();

        listString.add("Z-Test1");
        listString.add("B-Test2");
        listString.add("A-Test3");
        listString.add("U-Test4");

        showElements(listString);

        Collections.sort(listString);

        showElements(listString);
    }

    static void showElements(List<String> list) {
        for(String element:list) {
            System.out.println(element);
        }
    }
}
