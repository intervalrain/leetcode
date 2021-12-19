package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n13_RomanToIntegerTest {

    n13_RomanToInteger clz = new n13_RomanToInteger();
    String s;
    int actual, expected;

    @Test
    public void test1(){
        s = "III";
        actual = clz.romanToInt(s);
        expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        s = "IV";
        actual = clz.romanToInt(s);
        expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        s = "IX";
        actual = clz.romanToInt(s);
        expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    public void test4(){
        s = "LVIII";
        actual = clz.romanToInt(s);
        expected = 58;
        assertEquals(expected, actual);
    }

    @Test
    public void test5(){
        s = "MCMXCIV";
        actual = clz.romanToInt(s);
        expected = 1994;
        assertEquals(expected, actual);
    }
    
}