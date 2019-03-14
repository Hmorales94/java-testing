package com.platzi.test.tdd;

public class FizzBuzz {

    //Aplicando TDD, se desarrollará el método para aprobar gradualmenta las pruebas
    public static String FizzBuzz(int n){

        if(n%3 == 0 && n%5 == 0)
            return "fizzBuzz";
        else if(n%3 == 0 )
            return "fizz";
        else if(n%5 == 0 )
            return "buzz";
        else
            return String.valueOf(n);
    }
}
