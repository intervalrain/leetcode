package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n3_LongestSubstringWithoutRepeatingCharactersTest {
    
    n3_LongestSubstringWithoutRepeatingCharacters clz = new n3_LongestSubstringWithoutRepeatingCharacters();

    String s;
    int expected;
    int actual;    

    @Test
    public void test1(){
        s = "abcabcbb";
        actual = clz.lengthOfLongestSubstring(s);
        expected = 3;
        assertEquals(actual, expected);
    }

    @Test
    public void test2(){
        s = "bbbbb";
        actual = clz.lengthOfLongestSubstring(s);
        expected = 1;
        assertEquals(actual, expected);
    }

    @Test
    public void test3(){
        s = "pwwkew";
        actual = clz.lengthOfLongestSubstring(s);
        expected = 3;
        assertEquals(actual, expected);
    }

    @Test
    public void test4(){
        s = "";
        actual = clz.lengthOfLongestSubstring(s);
        expected = 0;
        assertEquals(actual, expected);
    }
}
