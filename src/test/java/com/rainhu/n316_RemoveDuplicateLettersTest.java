package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n316_RemoveDuplicateLettersTest {
    
    n316_RemoveDuplicateLetters clz = new n316_RemoveDuplicateLetters();
    String s, expected, actual;

    @Test
    public void test1(){
        s = "bcabc";
        expected = "abc";
        actual = clz.removeDuplicateLetters(s);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        s = "cbacdcbc";
        expected = "acdb";
        actual = clz.removeDuplicateLetters(s);
        assertEquals(expected, actual);
    }
}