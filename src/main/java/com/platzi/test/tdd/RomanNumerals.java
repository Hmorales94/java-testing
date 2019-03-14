package com.platzi.test.tdd;

import java.util.Arrays;
import java.util.List;

public class RomanNumerals {

    //Refactor
    enum RomanNumeral {

        M(1000),CM(900),D(500),CD(400),
        C(100),XC(90),L(50),XL(40),
        X(10),IX(9),V(5),IV(4),
        I(1);

        private int value;

        RomanNumeral(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public static List<RomanNumeral> getRomanNumerals() {
            return Arrays.asList(RomanNumeral.values());
        }

    }

    public static String arabicToRoman(int n) {

        StringBuilder collator = new StringBuilder();
        List<RomanNumeral> romanNumerals= RomanNumeral.getRomanNumerals();

        //Valida que el número sea menor a 4000 debido a que el formato cambia
        if (n > 0 && n < 4000) {

            int i = 0;
            while(n>0 && i<romanNumerals.size()){
                RomanNumeral currentRoman = romanNumerals.get(i);
                if(n>=currentRoman.getValue()){
                    collator.append(currentRoman);
                    n -= currentRoman.getValue();
                } else {
                    i++;
                }

            }

            String roman = collator.toString();
            return roman;

        } else {
            throw new IllegalArgumentException( n + "no está en el rango (0,4000)");
        }
    }


    /*
    //First approach
    public static String arabicToRoman(int n) {
        StringBuilder collator = new StringBuilder();

        //Valida que el número sea menor a 4000 debido a que el formato cambia
        if (n > 0 && n < 4000) {
            while(n>=1000) {
                collator.append("M");
                n -= 1000;
            }

            if(n>=900){
                collator.append("CM");
                n -= 900;
            }

            if(n>=500){
                collator.append("D");
                n -= 500;
            }

            if(n>=400){
                collator.append("CD");
                n -= 400;
            }

            while(n>=100) {
                collator.append("C");
                n -= 100;
            }

            if(n>=90){
                collator.append("XC");
                n -= 90;
            }

            if(n>=50){
                collator.append("L");
                n -= 50;
            }

            if(n>=40){
                collator.append("XL");
                n -= 40;
            }

            while(n>=10) {
                collator.append("X");
                n -= 10;
            }

            if(n>=9){
                collator.append("IX");
                n -= 90;
            }

            if(n>=5){
                collator.append("V");
                n -= 5;
            }

            if(n>=4){
                collator.append("IV");
                n -= 4;
            }

            while(n>=1) {
                collator.append("I");
                n -= 1;
            }

            String roman = collator.toString();
            return roman;

        } else {
            throw new IllegalArgumentException( n + "no está en el rango (0,4000)");
        }
    }

    */
}
