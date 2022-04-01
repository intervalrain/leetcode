package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n410_SplitArrayLargestSumTest{

    n410_SplitArrayLargestSum clz = new n410_SplitArrayLargestSum();
    int[] nums;
    int m;
    int expected, actual;

    @Test
    public void test1(){
        nums = new int[]{7,2,5,10,8};
        m = 2;
        expected = 18;
        actual = clz.splitArray(nums, m);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        nums = new int[]{1,2,3,4,5};
        m = 2;
        expected = 9;
        actual = clz.splitArray(nums, m);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        nums = new int[]{1,4,4};
        m = 3;
        expected = 4;
        actual = clz.splitArray(nums, m);
        assertEquals(expected, actual);
    }

    @Test
    public void test4(){
        nums = new int[]{7,2,5,10,8};
        m = 3;
        expected = 14;
        actual = clz.splitArray(nums, m);
        assertEquals(expected, actual);
    }
}