package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n844_BackspaceStringCompareTest {
    
    n844_BackspaceStringCompare clz = new n844_BackspaceStringCompare();
    String s, t;
    boolean expected, actual;

    @Test
    public void test1(){
        s = "ab#c";
        t = "ad#c";
        expected = true;
        actual = clz.backspaceCompare(s, t);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        s = "ab##";
        t = "c#d#";
        expected = true;
        actual = clz.backspaceCompare(s, t);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        s = "a#c";
        t = "b";
        expected = false;
        actual = clz.backspaceCompare(s, t);
        assertEquals(expected, actual);
    }
}
