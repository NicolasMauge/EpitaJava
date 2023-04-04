package org.epita.tp.serie1;

import java.util.*;
public class ExercicesSupplementaires {
    public static long exercice1(long... entiers) {
        if (entiers.length == 0) return -1;

        int sumNumbers = 0;
        for (long entier : entiers) {
            sumNumbers += entier * entier;
        }
        return sumNumbers;
    }

    public static int exercice2(float[] decimaux) throws IllegalArgumentException {
        if (decimaux.length == 0) throw new IllegalArgumentException("A minima, il faudrait une valeur en paramètre");

        float meanNumbers = 0;
        for (float element : decimaux) {
            meanNumbers += element;
        }
        meanNumbers /= decimaux.length;

        return (int) meanNumbers;
    }

    public static int exercice3(long[] entiers) {
        int indexMostDistant = 0;
        long mostDistant = 0;
        for (int i = 0; i < entiers.length; i++) {
            long entier = entiers[i];
            if (entier > 0) {
                // on fait cela en deux temps pour gérer la priorité au positif
                // sinon, on aurait fait Math.abs
                // donc on met >= au lieu de >
                if (entier >= mostDistant) {
                    mostDistant = Math.abs(entier);
                    indexMostDistant = i;
                }
            } else {
                if (-entier > mostDistant) {
                    mostDistant = Math.abs(entier);
                    indexMostDistant = i;
                }
            }
        }
        return indexMostDistant;
    }

    public static long exercice4(int n) {
        if (n == 0) return 0;
        else if (n == 1) return 1;

        long nMinus1 = 1;
        long nMinus2 = 0;
        long nCurrent = 0;
        for (int i = 2; i <= n; i++) {
            nCurrent = nMinus1 + nMinus2;

            nMinus2 = nMinus1;
            nMinus1 = nCurrent;
        }
        return nCurrent;
    }

    public static boolean exercice5(int age, int physique, long revenusAnnuels) {
        if (revenusAnnuels >= 1000000) return true;
        if ((age < 18) || (age > 35)) return false;
        if (physique < 8) return false;
        if (revenusAnnuels < 50000) return false;
        return true;
    }

    public static String exercice6(String numeroClair) {
        if (numeroClair.length() < 4) return numeroClair;

        String prefixSharp = "";
        for (int i = 0; i < numeroClair.length() - 4; i++) {
            prefixSharp = prefixSharp.concat("#");
        }
        String subString = numeroClair.substring(numeroClair.length() - 4);

        return prefixSharp.concat(subString);
    }

    public static String exercice7(String texteMinEtMaj) {
        int numberUpper = 0;
        int numberLow = 0;
        for (int i = 0; i < texteMinEtMaj.length(); i++) {
            char currentChar = texteMinEtMaj.charAt(i);
            if (Character.isLetter(currentChar)) {
                if (Character.isLowerCase(currentChar)) {
                    numberLow++;
                } else {
                    numberUpper++;
                }
            }
        }

        if (numberLow > numberUpper) {
            return texteMinEtMaj.toLowerCase();
        } else if (numberLow < numberUpper) {
            return texteMinEtMaj.toUpperCase();
        } else {
            return texteMinEtMaj;
        }
    }

    public static long exercice8(int[] entiers) {
        int multiplication = entiers[0] * entiers[1];
        for (int i = 2; i < entiers.length; i++) {
            if (entiers[i - 1] * entiers[i] > multiplication) {
                multiplication = entiers[i - 1] * entiers[i];
            }
        }

        return multiplication;
    }

    public static long exercice9(int[] entiersPositifs) {
        //List<Integer> entiersInt = new ArrayList<>()
        Set<Integer> setEntiers = new HashSet<>();
        for (int entier : entiersPositifs) {
            setEntiers.add(entier);
        }

        List<Integer> listEntiers = new ArrayList<>(setEntiers);
        Collections.sort(listEntiers);

        String output = "";
        for (int entier : listEntiers) {
            output = output.concat(String.valueOf(entier));
        }

        return Long.parseLong(output);
    }

    public static long exercice10(String nombre, int nombreVirgules) {
        if (nombreVirgules == 0) {
            return Long.parseLong(nombre);
        }
        if (nombre.length() <= nombreVirgules) {
            return -1;
        } else if (nombre.length() == nombreVirgules + 1) {
            return Long.parseLong(nombre);
        }

        long maximumValue = 0;
        for (int indexDecoupe = 1; indexDecoupe < nombre.length(); indexDecoupe++) {
            String partGauche = nombre.substring(0, indexDecoupe);
            String partDroite = nombre.substring(indexDecoupe);

            if (partGauche.length() <= nombre.length() - nombreVirgules) {
                long localMaximum = Math.max(   Long.parseLong(partGauche),
                                                exercice10(partDroite, nombreVirgules - 1));
                if (localMaximum > maximumValue) {
                    maximumValue = localMaximum;
                }
            }
        }
        return maximumValue;
    }

    public static boolean exercice11(int pieces10ct, int pieces20ct, int pieces50ct, int totalARendre) {
        for(int dix=0;dix<=pieces10ct;dix++) {
            for(int vingt=0;vingt<=pieces20ct;vingt++) {
                for(int cinquante=0;cinquante<=pieces50ct;cinquante++) {
                    int total = dix*10 + vingt*20 + cinquante*50;
                    if(total == totalARendre) {
                        return true;
                    }
                }
            }
        }
        return false;
    }


}