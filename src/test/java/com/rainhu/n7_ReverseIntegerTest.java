package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n7_ReverseIntegerTest {
 
    n7_ReverseInteger clz = new n7_ReverseInteger();
    int x;
    int expected, actual;

    @Test
    public void test1(){
        x = 123;
        actual = clz.reverse(x);
        expected = 321;
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        x = -123;
        actual = clz.reverse(x);
        expected = -321;
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        x = 120;
        actual = clz.reverse(x);
        expected = 21;
        assertEquals(expected, actual);
    }

    @Test
    public void test4(){
        x = 0;
        actual = clz.reverse(x);
        expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void test5(){
        x = Integer.MAX_VALUE;
        actual = clz.reverse(x);
        expected = 0;
        assertEquals(expected, actual);
    }
}

