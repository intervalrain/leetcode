package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n902_NumbersAtMostNGivenDigitSetTest {
    
    n902_NumbersAtMostNGivenDigitSet clz = new n902_NumbersAtMostNGivenDigitSet();
    String[] digits;
    int n;
    int expected;
    int actual;

    @Test
    public void test1(){
        digits = new String[]{"1","3","5","7"};
        n = 100;
        expected = 20;
        actual = clz.atMostNGivenDigitSet(digits, n);
        assertEquals(expected, actual);
    }    

    @Test
    public void test2(){
        digits = new String[]{"1","4","9"};
        n = 1000000000;
        expected = 29523;
        actual = clz.atMostNGivenDigitSet(digits, n);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        digits = new String[]{"7"};
        n = 8;
        expected = 1;
        actual = clz.atMostNGivenDigitSet(digits, n);
        assertEquals(expected, actual);
    }

    @Test
    public void test4(){
        digits = new String[]{"3", "5"};
        n = 4;
        expected = 1;
        actual = clz.atMostNGivenDigitSet(digits, n);
        assertEquals(expected, actual);
    }    
}
