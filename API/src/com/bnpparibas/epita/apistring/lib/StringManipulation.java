package com.bnpparibas.epita.apistring.lib;

public class StringManipulation {
    static public int nbOccChar(String chaine, char caractere) {
        int numberOfChar = 0;
        for (int i = 0; i < chaine.length(); i++) {
            if(chaine.charAt(i) == caractere) {
                numberOfChar ++;
            }
        }
        return numberOfChar;
    }

    static public String replaceCharByChar(String chaine, char from, char to) {
        char[] newString = new char[chaine.length()];
        for(int i=0;i<chaine.length();i++) {
            if(chaine.charAt(i)==from) {
                newString[i] = to;
            } else {
                newString[i] = chaine.charAt(i);
            }
        }

        return String.valueOf(newString);
    }
}
