package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n227_BasicCalculatorIITest{

    n227_BasicCalculatorII clz = new n227_BasicCalculatorII();
    String s;
    int expected;
    int actual;

    @Test
    public void test1(){
        s = "3+2*2";
        expected = 7;
        actual = clz.calculate(s);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        s = " 3/2 ";
        expected = 1;
        actual = clz.calculate(s);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        s = " 3+5 / 2 ";
        expected = 5;
        actual = clz.calculate(s);
        assertEquals(expected, actual);
    }
}