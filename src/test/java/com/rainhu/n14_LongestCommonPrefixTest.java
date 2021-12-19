package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class n14_LongestCommonPrefixTest {
    
    n14_LongestCommonPrefix clz = new n14_LongestCommonPrefix();
    String[] strs;
    String actual, expected;

    @Test
    public void test1(){
        strs = new String[]{"flower", "flow", "flight"};
        actual = clz.longestCommonPrefix(strs);
        expected = "fl";
        assertTrue(actual.equals(expected));
    }

    @Test
    public void test2(){
        strs = new String[]{"dog", "racecar", "car"};
        actual = clz.longestCommonPrefix(strs);
        expected = "";
        assertTrue(actual.equals(expected));
    }
}   
