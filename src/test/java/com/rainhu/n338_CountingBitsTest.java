package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class n338_CountingBitsTest {
    
    n338_CountingBits clz = new n338_CountingBits();
    int n;
    int[] expected, actual;

    @Test
    public void test1(){
        n = 2;
        expected = new int[]{0,1,1};
        actual = clz.countBits(n);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void test2(){
        n = 5;
        expected = new int[]{0,1,1,2,1,2};
        actual = clz.countBits(n);
        assertArrayEquals(expected, actual);
    }
}
