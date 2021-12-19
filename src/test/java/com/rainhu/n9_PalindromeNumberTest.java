package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n9_PalindromeNumberTest{

    n9_PalindromeNumber clz =  new n9_PalindromeNumber();
    int x;
    boolean expected, actual;

    @Test
    public void test1(){
        x = 121;
        actual = clz.isPalindrome(x);
        expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        x = -121;
        actual = clz.isPalindrome(x);
        expected = false;
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        x = 10;
        actual = clz.isPalindrome(x);
        expected = false;
        assertEquals(expected, actual);
    }

    @Test
    public void test4(){
        x = -101;
        actual = clz.isPalindrome(x);
        expected = false;
        assertEquals(expected, actual);
    }

}