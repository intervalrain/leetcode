package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n10_RegularExpressionMatchingTest {

    n10_RegularExpressionMatching clz = new n10_RegularExpressionMatching();
    String s, p;
    boolean expected, actual;

    @Test
    public void test1(){
        s = "aa";
        p = "a";
        actual = clz.isMatch2(s, p);
        expected = false;
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        s = "aa";
        p = "a*";
        actual = clz.isMatch2(s, p);
        expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        s = "ab";
        p = ".*";
        actual = clz.isMatch2(s, p);
        expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void test4(){
        s = "aab";
        p = "c*a*b";
        actual = clz.isMatch2(s, p);
        expected = true;
    }

    @Test
    public void test5(){
        s = "mississippi";
        p = "mis*is*p*.";
        actual = clz.isMatch2(s, p);
        expected = false;
        assertEquals(expected, actual);
    }
    @Test
    public void test6(){
        s = "mississippi";
        p = "mis*is*ip*.";
        actual = clz.isMatch2(s, p);
        expected = true;
        assertEquals(expected, actual);
    }
    
}