package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n878_NthMagicalNumberTest{

    n878_NthMagicalNumber clz = new n878_NthMagicalNumber();
    int n;
    int a;
    int b;
    int expected;
    int actual;

    @Test
    public void test1(){
        n = 1;
        a = 2;
        b = 3;
        expected = 2;
        actual = clz.nthMagicalNumber(n, a, b);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        n = 4;
        a = 2;
        b = 3;
        expected = 6;
        actual = clz.nthMagicalNumber(n, a, b);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        n = 5;
        a = 2;
        b = 4;
        expected = 10;
        actual = clz.nthMagicalNumber(n, a, b);
        assertEquals(expected, actual);
    }

    @Test
    public void test4(){
        n = 3;
        a = 6;
        b = 4;
        expected = 8;
        actual = clz.nthMagicalNumber(n, a, b);
        assertEquals(expected, actual);
    }

    @Test
    public void test5(){
        n = 400000000;
        a = 6;
        b = 4;
        expected = 199999993;
        actual = clz.nthMagicalNumber(n, a, b);
        assertEquals(expected, actual);
    }



}

