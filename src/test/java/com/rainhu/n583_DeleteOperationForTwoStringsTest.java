package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n583_DeleteOperationForTwoStringsTest {
    
    n583_DeleteOperationForTwoStrings clz = new n583_DeleteOperationForTwoStrings();
    String word1, word2;
    int expected, actual;

    @Test
    public void test1(){
        word1 = "sea";
        word2 = "eat";
        expected = 2;
        actual = clz.minDistance(word1, word2);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        word1 = "leetcode";
        word2 = "etco";
        expected = 4;
        actual = clz.minDistance(word1, word2);
        assertEquals(expected, actual);
    }
}
