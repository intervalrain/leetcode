package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n392_IsSubquenceTest {
    
    n392_IsSubquence clz = new n392_IsSubquence();
    String s, t;
    boolean expected, actual;

    @Test
    public void test1(){
        s = "abc";
        t = "ahbgdc";
        expected = true;
        actual = clz.isSubsequence(s, t);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        s = "axc";
        t = "ahbgdc";
        expected = false;
        actual = clz.isSubsequence(s, t);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        s = "b";
        t = "abc";
        expected = true;
        actual = clz.isSubsequence(s, t);
        assertEquals(expected, actual);
    }

    @Test
    public void test4(){
        s = "";
        t = "abcde";
        expected = true;
        actual = clz.isSubsequence(s, t);
        assertEquals(expected, actual);
    }
}
