package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import java.util.List;

public class n5_LongestPalindromicSubstringTest {
    
    n5_LongestPalindromicSubstring clz = new n5_LongestPalindromicSubstring();
    
    String s;
    String actual;
    List<String> expected;
    
    @Test
    public void test1(){
        s = "babad";
        actual = clz.longestPalindrome(s);
        expected = List.of("aba", "bab");
        assertTrue(expected.contains(actual));
    }
    @Test
    public void test2(){
        s = "cbbd";
        actual = clz.longestPalindrome(s);
        expected = List.of("bb");
        assertTrue(expected.contains(actual));
    }
    @Test
    public void test3(){
        s = "a";
        actual = clz.longestPalindrome(s);
        expected = List.of("a");
        assertTrue(expected.contains(actual));
    }
    @Test
    public void test4(){
        s = "ac";
        actual = clz.longestPalindrome(s);
        expected = List.of("a", "c");
        assertTrue(expected.contains(actual));
    }
}
