package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n1048_LongestStringChainTest {
    
    n1048_LongestStringChain clz = new n1048_LongestStringChain();
    String[] words;
    int expected, actual;

    @Test
    public void test1(){
        words = new String[]{"a", "b", "ba", "bca", "bda", "bdca"};
        expected = 4;
        actual = clz.longestStrChain(words);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        words = new String[]{"xbc", "pcxbcf", "xb", "cxbc", "pcxbc"};
        expected = 5;
        actual = clz.longestStrChain(words);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        words = new String[]{"abcd", "dbqca"};
        expected = 1;
        actual = clz.longestStrChain(words);
        assertEquals(expected, actual);
    }
}
