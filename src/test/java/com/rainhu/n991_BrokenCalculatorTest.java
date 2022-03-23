package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n991_BrokenCalculatorTest {
    
    n991_BrokenCalculator clz = new n991_BrokenCalculator();
    int startValue, target;
    int expected, actual;

    @Test
    public void test1(){
        startValue = 2;
        target = 3;
        expected = 2;
        actual = clz.brokenCalc(startValue, target);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        startValue = 5;
        target = 8;
        expected = 2;
        actual = clz.brokenCalc(startValue, target);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        startValue = 3;
        target = 10;
        expected = 3;
        actual = clz.brokenCalc(startValue, target);
        assertEquals(expected, actual);
    }

    @Test
    public void test4(){
        startValue = 1024;
        target = 1;
        expected = 1023;
        actual = clz.brokenCalc(startValue, target);
        assertEquals(expected, actual);
    }

    @Test
    public void test5(){
        startValue = 68;
        target = 71;
        expected = 34;
        actual = clz.brokenCalc(startValue, target);
        assertEquals(expected, actual);
    }
}
