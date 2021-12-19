package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n441_ArrangingCoinsTest {
    
    n441_ArrangingCoins clz = new n441_ArrangingCoins();

    int n;
    int expected;
    int actual;

    @Test
    public void test1(){
        n = 5;
        expected = 2;
        actual = clz.arrangeCoins(n);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        n = 8;
        expected = 3;
        actual = clz.arrangeCoins(n);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        n = 10;
        expected = 4;
        actual = clz.arrangeCoins(n);
        assertEquals(expected, actual);
    }

    @Test
    public void test4(){
        n = 1804289383;
        expected = 60070;
        actual = clz.arrangeCoins(n);
        assertEquals(expected, actual);
    }

    @Test
    public void test5(){
        n = 1;
        expected = 1;
        actual = clz.arrangeCoins(n);
        assertEquals(expected, actual);
    }

}