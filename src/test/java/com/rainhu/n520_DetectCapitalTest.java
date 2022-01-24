package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n520_DetectCapitalTest {
    
    n520_DetectCapital clz = new n520_DetectCapital();
    String word;
    boolean expected;
    boolean actual;

    @Test
    public void test1(){
        word = "USA";
        expected = true;
        actual = clz.detectCapitalUse(word);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        word = "FlaG";
        expected = false;
        actual = clz.detectCapitalUse(word);
        assertEquals(expected, actual);
    }
}
