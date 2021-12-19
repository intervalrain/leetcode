package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n125_ValidPalindromeTest {
    
    n125_ValidPalindrome clz = new n125_ValidPalindrome();
    String s;
    boolean expected;
    boolean actual;

    @Test
    public void test1(){
        s = "A man, a plan, a canal: Panama";
        expected = true;
        actual = clz.isPalindrome(s);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        s = "race a car";
        expected = false;
        actual = clz.isPalindrome(s);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        s = " ";
        expected = true;
        actual = clz.isPalindrome(s);
        assertEquals(expected, actual);
    }

    @Test
    public void test4(){
        s = "0P";
        expected = false;
        actual = clz.isPalindrome(s);
        assertEquals(expected, actual);
    }
}
