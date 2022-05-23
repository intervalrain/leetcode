package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n474_OnesAndZerosTest {
    
    n474_OnesAndZeros clz = new n474_OnesAndZeros();
    String[] strs;
    int m, n;
    int expected, actual;

    @Test
    public void test1(){
        strs = new String[]{"10","0001","111001","1","0"};
        m = 5;
        n = 3;
        expected = 4;
        actual = clz.findMaxForm(strs, m, n);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        strs = new String[]{"10","0","1"};
        m = 1;
        n = 1;
        expected = 2;
        actual = clz.findMaxForm(strs, m, n);
        assertEquals(expected, actual);
    }
}
