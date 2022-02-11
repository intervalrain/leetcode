package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n567_PermutationInStringTest {
    
    n567_PermutationInString clz = new n567_PermutationInString();
    String s1, s2;
    boolean expected, actual;

    @Test
    public void test1(){
        s1 = "ab";
        s2 = "eidbaooo";
        expected = true;
        actual = clz.checkInclusion(s1, s2);
        assertEquals(expected, actual);
        actual = clz.checkInclusion2(s1, s2);
        assertEquals(expected, actual);
    }

    @Test
    public void terst2(){
        s1 = "ab";
        s2 = "eidboaoo";
        expected = false;
        actual = clz.checkInclusion(s1, s2);
        assertEquals(expected, actual);
        actual = clz.checkInclusion2(s1, s2);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        s1 = "adc";
        s2 = "dcda";
        expected = true;
        actual = clz.checkInclusion(s1, s2);
        assertEquals(expected, actual);
        actual = clz.checkInclusion2(s1, s2);
        assertEquals(expected, actual);
    }

    @Test
    public void test4(){
        s1 = "acd";
        s2 = "abcd";
        expected = false;
        actual = clz.checkInclusion(s1, s2);
        assertEquals(expected, actual);
        actual = clz.checkInclusion2(s1, s2);
        assertEquals(expected, actual);
    }
}
