package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n1015_SmallestIntegerDivisibleByKTest {
    
    n1015_SmallestIntegerDivisibleByK clz = new n1015_SmallestIntegerDivisibleByK();
    int k;
    int expected;
    int actual;

    @Test
    public void test1(){
        k = 1;
        expected = 1;
        actual = clz.smallestRepunitDivByK(k);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        k = 2;
        expected = -1;
        actual = clz.smallestRepunitDivByK(k);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        k = 3;
        expected = 3;
        actual = clz.smallestRepunitDivByK(k);
        assertEquals(expected, actual);
    }
}
