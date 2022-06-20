package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n820_ShortEncodingOfWordsTest {
    
    n820_ShortEncodingOfWords clz = new n820_ShortEncodingOfWords();
    String[] words;
    int expected, actual;

    @Test
    public void test1(){
        words = new String[]{"time", "me", "bell"};
        expected = 10;
        actual = clz.minimumLengthEncoding(words);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        words = new String[]{"t"};
        expected = 2;
        actual = clz.minimumLengthEncoding(words);
        assertEquals(expected, actual);
    }
}
