package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n1332_RemovePalindromicSubsequencesTest {
    
    n1332_RemovePalindromicSubsequences clz = new n1332_RemovePalindromicSubsequences();
    String s;
    int expected, actual;

    @Test
    public void test1(){
        s = "ababa";
        expected = 1;
        actual = clz.removePalindromeSub(s);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        s = "abb";
        expected = 2;
        actual = clz.removePalindromeSub(s);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        s = "baabb";
        expected = 2;
        actual = clz.removePalindromeSub(s);
        assertEquals(expected, actual);
    }
}
