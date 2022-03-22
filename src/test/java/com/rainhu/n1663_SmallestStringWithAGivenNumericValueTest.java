package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n1663_SmallestStringWithAGivenNumericValueTest {
    
    n1663_SmallestStringWithAGivenNumericValue clz = new n1663_SmallestStringWithAGivenNumericValue();
    int n, k;
    String expected, actual;

    @Test
    public void test1(){
        n = 3;
        k = 27;
        expected = "aay";
        actual = clz.getSmallestString(n, k);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        n = 5;
        k = 73;
        expected = "aaszz";
        actual = clz.getSmallestString(n, k);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        n = 5;
        k = 130;
        expected = "zzzzz";
        actual = clz.getSmallestString(n, k);
        assertEquals(expected, actual);
    }
}
