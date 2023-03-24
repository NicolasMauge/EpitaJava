package com.bnpparibas.epita.poo.exo5;

import com.bnpparibas.epita.poo.exo5.singleton.MySingleton;

public class Main {
    public static void main(String[] args) {
        MySingleton single = MySingleton.getInstance("Larousse");
        MySingleton two = MySingleton.getInstance("Robert");

        System.out.println(single.getTitre());
        System.out.println(two.getTitre());
    }
}
