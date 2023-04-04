package com.epita.lafabrique;

public class StringCalculator {
    public static String calculator(String chaine){
        if(chaine =="") return "0";

        String[] splitChaine = chaine.split(",");

        if(splitChaine.length==1){
            return chaine;
        } else {
            int returnValue = Integer.parseInt(splitChaine[0]);
            for(int i=1;i<splitChaine.length;i++) {
                returnValue += Integer.parseInt(splitChaine[i]);
            }
            return String.valueOf(returnValue);
        }
    }
}
