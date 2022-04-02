package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n680_ValidPalindromeIITest {
    
    n680_ValidPalindromeII clz = new n680_ValidPalindromeII();
    String s;
    boolean expected, actual;
    
    @Test
    public void test1(){
        s = "aba";
        expected = true;
        actual = clz.validPalindrome(s);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        s = "abca";
        expected = true;
        actual = clz.validPalindrome(s);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        s = "abc";
        expected = false;
        actual = clz.validPalindrome(s);
        assertEquals(expected, actual);
    }
}
