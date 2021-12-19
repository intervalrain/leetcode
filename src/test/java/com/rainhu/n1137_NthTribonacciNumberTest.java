package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n1137_NthTribonacciNumberTest {

    n1137_NthTribonacciNumber clz = new n1137_NthTribonacciNumber();
    int n;
    int expected;
    int actual;

    @Test
    public void test1(){
        n = 4;
        expected = 4;
        actual = clz.tribonacci(n);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        n = 25;
        expected = 1389537;
        actual = clz.tribonacci(n);
        assertEquals(expected, actual);
    }
}
