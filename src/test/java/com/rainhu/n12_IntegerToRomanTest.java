package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class n12_IntegerToRomanTest {
    
    n12_IntegerToRoman clz = new n12_IntegerToRoman();
    int num;
    String actual, expected;

    @Test
    public void test1(){
        num = 3;
        actual = clz.intToRoman(num);
        expected = "III";
        assertTrue(actual.equals(expected));
    }

    @Test
    public void test2(){
        num = 4;
        actual = clz.intToRoman(num);
        expected = "IV";
        assertTrue(actual.equals(expected));
    }

    @Test
    public void test3(){
        num = 9;
        actual = clz.intToRoman(num);
        expected = "IX";
        assertTrue(actual.equals(expected));
    }

    @Test
    public void test4(){
        num = 58;
        actual = clz.intToRoman(num);
        expected = "LVIII";
        assertTrue(actual.equals(expected));
    }

    @Test
    public void test5(){
        num = 1994;
        actual = clz.intToRoman(num);
        expected = "MCMXCIV";
        assertTrue(actual.equals(expected));
    }
}
