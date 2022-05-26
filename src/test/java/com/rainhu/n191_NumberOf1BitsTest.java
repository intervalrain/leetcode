package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n191_NumberOf1BitsTest {
    
    n191_NumberOf1Bits clz = new n191_NumberOf1Bits();
    int n;
    int expected, actual;

    @Test
    public void test1(){
        n = 0b00000000000000000000000000001011;
        expected = 3;
        actual = clz.hammingWeight(n);
        assertEquals(expected, actual);
    }
    
    @Test
    public void test2(){
        n = 0b00000000000000000000000010000000;
        expected = 1;
        actual = clz.hammingWeight(n);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        n = 0b11111111111111111111111111111101;
        expected = 31;
        actual = clz.hammingWeight(n);
        assertEquals(expected, actual);
    }
}
