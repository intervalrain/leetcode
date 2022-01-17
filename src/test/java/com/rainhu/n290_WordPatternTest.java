package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n290_WordPatternTest {
    
    n290_WordPattern clz = new n290_WordPattern();
    String pattern;
    String s;
    boolean expected;
    boolean actual;

    @Test
    public void test1(){
        pattern = "abba";
        s = "dog cat cat dog";
        expected = true;
        actual = clz.wordPattern(pattern, s);
        assertEquals(expected, actual);
    }
    
    @Test
    public void test2(){
        pattern = "abba";
        s = "dog cat cat fish";
        expected = false;
        actual = clz.wordPattern(pattern, s);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        pattern = "aaaa";
        s = "dog cat cat dog";
        expected = false;
        actual = clz.wordPattern(pattern, s);
        assertEquals(expected, actual);
    }

    @Test
    public void test4(){
        pattern = "abba";
        s = "dog dog dog dog";
        expected = false;
        actual = clz.wordPattern(pattern, s);
        assertEquals(expected, actual);
    }

    @Test
    public void test5(){
        pattern = "e";
        s = "eukera";
        expected = true;
        actual = clz.wordPattern(pattern, s);
        assertEquals(expected, actual);
    }
}
