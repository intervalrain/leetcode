package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n402_RemoveKDigitsTest {
    
    n402_RemoveKDigits clz = new n402_RemoveKDigits();
    String num;
    int k;
    String expected, actual;

    @Test
    public void test1(){
        num = "1432219";
        k = 3;
        expected = "1219";
        actual = clz.removeKdigits(num, k);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        num = "10200";
        k = 1;
        expected = "200";
        actual = clz.removeKdigits(num, k);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        num = "10";
        k = 2;
        expected = "0";
        actual = clz.removeKdigits(num, k);
        assertEquals(expected, actual);
    }

    @Test
    public void test4(){
        num = "112";
        k = 1;
        expected = "11";
        actual = clz.removeKdigits(num, k);
        assertEquals(expected, actual);
    }

    @Test
    public void test5(){
        num = "10";
        k = 1;
        expected = "0";
        actual = clz.removeKdigits(num, k);
        assertEquals(expected, actual);
    }
}
