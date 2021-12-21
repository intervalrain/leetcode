package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n231_PowerOfTwoTest{
    
    n231_PowerOfTwo clz = new n231_PowerOfTwo();
    int n;
    boolean expected;
    boolean actual;

    @Test
    public void test1(){
        n = 1;
        expected = true;
        actual = clz.isPowerOfTwo(n);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        n = 16;
        expected = true;
        actual = clz.isPowerOfTwo(n);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        n = 3;
        expected = false;
        actual = clz.isPowerOfTwo(n);
        assertEquals(expected, actual);
    }

    @Test
    public void test4(){
        n = Integer.MAX_VALUE;
        expected = false;
        actual = clz.isPowerOfTwo(n);
        assertEquals(expected, actual);
    }
    
    @Test
    public void test5(){
        int n = 0x7fffffff;
        expected = false;
        actual = clz.isPowerOfTwo(n);
        assertEquals(expected, actual);
    }

    @Test
    public void test6(){
        int n = 0x40000000;
        System.out.println(n);
        expected = true;
        actual = clz.isPowerOfTwo(n);
        assertEquals(expected, actual);
    }

    
}