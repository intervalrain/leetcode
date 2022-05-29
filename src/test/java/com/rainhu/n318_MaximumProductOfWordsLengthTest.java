package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n318_MaximumProductOfWordsLengthTest {
    n318_MaximumProductOfWordsLength clz = new n318_MaximumProductOfWordsLength();
    String[] words;
    int expected, actual;

    @Test
    public void test1(){
        words = new String[]{"abcw", "baz", "foo", "bar", "xtfn", "abcdef"};
        expected = 16;
        actual = clz.maxProduct(words);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        words = new String[]{"a", "ab", "abc", "d", "cd", "bcd", "abcd"};
        expected = 4;
        actual = clz.maxProduct(words);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        words = new String[]{"a", "aa", "aaa", "aaaa"};
        expected = 0;
        actual = clz.maxProduct(words);
        assertEquals(expected, actual);
    } 
}
