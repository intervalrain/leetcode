package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n136_SingleNumberTest{

    n136_SingleNumber clz = new n136_SingleNumber();
    int[] nums;
    int expected, actual;

    @Test
    public void test1(){
        nums = new int[]{2,2,1};
        expected = 1;
        actual = clz.singleNumber(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        nums = new int[]{4,1,2,1,2};
        expected = 4;
        actual = clz.singleNumber(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        nums = new int[]{1};
        expected = 1;
        actual = clz.singleNumber(nums);
        assertEquals(expected, actual);
    }
}