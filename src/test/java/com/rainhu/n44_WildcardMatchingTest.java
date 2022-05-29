package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n44_WildcardMatchingTest {
    
    n44_WildcardMatching clz = new n44_WildcardMatching();
    String s, p;
    boolean expected, actual;

    @Test
    public void test1(){
        s = "aa";
        p = "a";
        expected = false;
        actual = clz.isMatch(s, p);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        s = "aa";
        p = "*";
        expected = true;
        actual = clz.isMatch(s, p);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        s = "cp";
        p = "?a";
        expected = false;
        actual = clz.isMatch(s, p);
        assertEquals(expected, actual);
    }

    @Test
    public void test4(){
        s = "abcdefc";
        p = "ab*c";
        expected = true;
        actual = clz.isMatch(s, p);
        assertEquals(expected, actual);
    }

    @Test
    public void test5(){
        s = "abcdefcd";
        p = "ab*c";
        expected = false;
        actual = clz.isMatch(s, p);
        assertEquals(expected, actual);
    }
}
