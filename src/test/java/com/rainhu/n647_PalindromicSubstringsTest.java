package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n647_PalindromicSubstringsTest {
    
    n647_PalindromicSubstrings clz = new n647_PalindromicSubstrings();
    String s;
    int expected, actual;

    @Test
    public void test1(){
        s = "abc";
        expected = 3;
        actual = clz.countSubstrings(s);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        s = "aaa";
        expected = 6;
        actual = clz.countSubstrings(s);
        assertEquals(expected, actual);
    }
}
