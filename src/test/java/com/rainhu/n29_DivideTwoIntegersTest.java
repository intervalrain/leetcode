package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n29_DivideTwoIntegersTest {
    
    n29_DivideTwoIntegers clz = new n29_DivideTwoIntegers();
    int dividend, divisor;
    int expected, actual;

    @Test
    public void test1(){
        dividend = 10;
        divisor = 3;
        expected = 3;
        actual = clz.divide(dividend, divisor);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        dividend = 7;
        divisor = -3;
        expected = -2;
        actual = clz.divide(dividend, divisor);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        dividend = 124;
        divisor = -3;
        expected = -41;
        actual = clz.divide(dividend, divisor);
        assertEquals(expected, actual);
    }

    @Test
    public void test4(){
        dividend = Integer.MAX_VALUE;
        divisor = 1;
        expected = Integer.MAX_VALUE;
        actual = clz.divide(dividend, divisor);
        assertEquals(expected, actual);
    }
}
