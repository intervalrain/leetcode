package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n258_AddDigitsTest {
    
    n258_AddDigits clz = new n258_AddDigits();
    int num;
    int expected, actual;

    @Test
    public void test1(){
        num = 38;
        expected = 2;
        actual = clz.addDigits(num);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        num = 0;
        expected = 0;
        actual = clz.addDigits(num);
        assertEquals(expected, actual);
    }
}
