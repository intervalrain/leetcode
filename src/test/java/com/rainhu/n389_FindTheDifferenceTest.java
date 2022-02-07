package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n389_FindTheDifferenceTest {
    
    n389_FindTheDifference clz = new n389_FindTheDifference();
    String s, t;
    char expected;
    char actual;

    @Test
    public void test1(){
        s = "abcd";
        t = "abcde";
        expected = 'e';
        actual = clz.findTheDifference(s, t);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        s = "";
        t = "y";
        expected = 'y';
        actual = clz.findTheDifference(s, t);
        assertEquals(expected, actual);
    }

}
