package com.epita.lafabrique;

public class FizzBuzz {

    public static String fizz(int number) throws MonException {
        if (number < 0) {
            throw new MonException();
        }
        String returnString = "";
        String numberInString = String.valueOf(number);


        if (number % 3 == 0) {
            returnString = returnString.concat("FIZZ");
        }

        if (number % 5 == 0) {
            returnString = returnString.concat("BUZZ");
        }

        if (number % 7 == 0) {
            returnString = returnString.concat("QIX");
        }

        for (int i = 0; i < numberInString.length(); i++) {
            switch (numberInString.charAt(i)) {
                case '3':
                    returnString = returnString.concat("FIZZ");
                    break;
                case '5':
                    returnString = returnString.concat("BUZZ");
                    break;
                case '7':
                    returnString = returnString.concat("QIX");
                    break;
                case '0':
                    returnString = returnString.concat("*");
                    break;
            }
        }

        if (returnString.equals("*")) {
            returnString = "";
            for (int i = 0; i < numberInString.length(); i++) {
                if (numberInString.charAt(i) == '0') {
                    returnString = returnString.concat("*");
                } else {
                    returnString = returnString.concat(String.valueOf(numberInString.charAt(i)));
                }

            }
        }
        if (returnString.equals("")) {
            return String.valueOf(number);
        } else {
            return returnString;
        }
    }
}
