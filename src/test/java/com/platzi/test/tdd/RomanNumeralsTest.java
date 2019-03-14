package com.platzi.test.tdd;

import org.junit.Test;

import static org.junit.Assert.*;

public class RomanNumeralsTest {

    @Test(expected = IllegalArgumentException.class)
    public void arabicToRoman_minus1_Exception() {
        assertEquals("",RomanNumerals.arabicToRoman(-1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void arabicToRoman_0_Exception() {
        assertEquals("",RomanNumerals.arabicToRoman(0));
    }

    @Test
    public void arabicToRoman_1_I() {
        assertEquals("I",RomanNumerals.arabicToRoman(1));
    }

    @Test
    public void arabicToRoman_2_II() {
        assertEquals("II",RomanNumerals.arabicToRoman(2));
    }

    @Test
    public void arabicToRoman_3_III() {
        assertEquals("III",RomanNumerals.arabicToRoman(3));
    }

    @Test
    public void arabicToRoman_5_V() {
        assertEquals("V",RomanNumerals.arabicToRoman(5));
    }

    @Test
    public void arabicToRoman_6_VI() {
        assertEquals("VI",RomanNumerals.arabicToRoman(6));
    }

    @Test
    public void arabicToRoman_7_VII() {
        assertEquals("VII",RomanNumerals.arabicToRoman(7));
    }

    @Test
    public void arabicToRoman_10_X() {
        assertEquals("X",RomanNumerals.arabicToRoman(10));
    }

    @Test
    public void arabicToRoman_11_XI() {
        assertEquals("XI",RomanNumerals.arabicToRoman(11));
    }

    @Test
    public void arabicToRoman_15_XV() {
        assertEquals("XV",RomanNumerals.arabicToRoman(15));
    }

    @Test
    public void arabicToRoman_16_XVI() {
        assertEquals("XVI",RomanNumerals.arabicToRoman(16));
    }

    @Test
    public void arabicToRoman_50_L() {
        assertEquals("L",RomanNumerals.arabicToRoman(50));
    }

    @Test
    public void arabicToRoman_51_LI() {
        assertEquals("LI",RomanNumerals.arabicToRoman(51));
    }

    @Test
    public void arabicToRoman_55_LV() {
        assertEquals("LV",RomanNumerals.arabicToRoman(55));
    }

    @Test
    public void arabicToRoman_56_LVI() {
        assertEquals("LVI",RomanNumerals.arabicToRoman(56));
    }

    @Test
    public void arabicToRoman_60_LX() {
        assertEquals("LX",RomanNumerals.arabicToRoman(60));
    }

    @Test
    public void arabicToRoman_70_LXX() {
        assertEquals("LXX",RomanNumerals.arabicToRoman(70));
    }

    @Test
    public void arabicToRoman_80_LXXX() {
        assertEquals("LXXX",RomanNumerals.arabicToRoman(80));
    }

    @Test
    public void arabicToRoman_81_LXXXI() {
        assertEquals("LXXXI",RomanNumerals.arabicToRoman(81));
    }

    @Test
    public void arabicToRoman_85_LXXXV() {
        assertEquals("LXXXV",RomanNumerals.arabicToRoman(85));
    }

    @Test
    public void arabicToRoman_86_LXXXVI() {
        assertEquals("LXXXVI",RomanNumerals.arabicToRoman(86));
    }

    @Test
    public void arabicToRoman_126_CXXVI() {
        assertEquals("CXXVI",RomanNumerals.arabicToRoman(126));
    }

    @Test
    public void arabicToRoman_1980_MCMLXXX() {
        assertEquals("MCMLXXX",RomanNumerals.arabicToRoman(1980));
    }

    @Test
    public void arabicToRoman_2507_MMDVII() {
        assertEquals("MMDVII",RomanNumerals.arabicToRoman(2507));
    }

    @Test(expected = IllegalArgumentException.class)
    public void arabicToRoman_4000_Exception() {
        assertEquals("",RomanNumerals.arabicToRoman(4000));
    }



}