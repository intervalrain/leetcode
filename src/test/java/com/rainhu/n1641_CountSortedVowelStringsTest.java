package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n1641_CountSortedVowelStringsTest {
    
    n1641_CountSortedVowelStrings clz = new n1641_CountSortedVowelStrings();
    int n;
    int expected, actual;

    @Test
    public void test1(){
        n = 1;
        expected = 5;
        actual = clz.countVowelStrings(n);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        n = 2;
        expected = 15;
        actual = clz.countVowelStrings(n);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        n = 33;
        expected = 66045;
        actual = clz.countVowelStrings(n);
        assertEquals(expected, actual);
    }

    @Test
    public void test4(){
        n = 50;
        expected = 316251;
        actual = clz.countVowelStrings(n);
        assertEquals(expected, actual);
    }
}
