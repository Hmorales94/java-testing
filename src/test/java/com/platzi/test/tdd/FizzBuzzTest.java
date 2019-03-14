package com.platzi.test.tdd;

import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    String fizz = "fizz";
    String buzz= "buzz";
    String fizzBuzz = "fizzBuzz";

    //Aplicando TDD, se desarrollará el método para aprobar gradualmenta las pruebas
    @Test
    public void fizzBuzz_3_fizz() {
        assertEquals(fizz, FizzBuzz.FizzBuzz(3));
    }

    @Test
    public void fizzBuzz_6_fizz() {
        assertEquals(fizz, FizzBuzz.FizzBuzz(6));
    }

    @Test
    public void fizzBuzz_5_buzz() {
        assertEquals(buzz, FizzBuzz.FizzBuzz(5));
    }

    @Test
    public void fizzBuzz_10_buzz() {
        assertEquals(buzz, FizzBuzz.FizzBuzz(10));
    }

    @Test
    public void fizzBuzz_15_fizzBuzz() {
        assertEquals(fizzBuzz, FizzBuzz.FizzBuzz(15));
    }

    @Test
    public void fizzBuzz_30_fizzBuzz() {
        assertEquals(fizzBuzz, FizzBuzz.FizzBuzz(30));
    }

    @Test
    public void fizzBuzz_2_2() {
        assertEquals("2",FizzBuzz.FizzBuzz(2));
    }

    @Test
    public void fizzBuzz_16_16() {
        assertEquals("16", FizzBuzz.FizzBuzz(16));
    }


}