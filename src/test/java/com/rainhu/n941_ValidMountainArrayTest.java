package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n941_ValidMountainArrayTest{

    n941_ValidMountainArray clz = new n941_ValidMountainArray();
    int[] arr;
    boolean expected;
    boolean actual;

    @Test
    public void test1(){
        arr = new int[]{2,1};
        expected = false;
        actual = clz.validMountainArray(arr);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        arr = new int[]{3,5,5};
        expected = false;
        actual = clz.validMountainArray(arr);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        arr = new int[]{0,3,2,1};
        expected = true;
        actual = clz.validMountainArray(arr);
        assertEquals(expected, actual);
    }

    @Test
    public void test4(){
        arr = new int[]{9,8,7,6};
        expected = false;
        actual = clz.validMountainArray(arr);
        assertEquals(expected, actual);
    }
}