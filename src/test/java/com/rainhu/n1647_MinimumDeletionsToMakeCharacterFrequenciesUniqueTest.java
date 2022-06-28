package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n1647_MinimumDeletionsToMakeCharacterFrequenciesUniqueTest {
    
    n1647_MinimumDeletionsToMakeCharacterFrequenciesUnique clz = new n1647_MinimumDeletionsToMakeCharacterFrequenciesUnique();
    String s;
    int expected, actual;

    @Test
    public void test1(){
        s = "aab";
        expected = 0;
        actual = clz.minDeletions(s);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        s = "aaabbbcc";
        expected = 2;
        actual = clz.minDeletions(s);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        s = "ceabaacb";
        expected = 2;
        actual = clz.minDeletions(s);
        assertEquals(expected, actual);
    }
    @Test
    public void test4(){
        s = "accdcdadddbaadbc";
        expected = 1;
        actual = clz.minDeletions(s);
        assertEquals(expected, actual);
    }
}
