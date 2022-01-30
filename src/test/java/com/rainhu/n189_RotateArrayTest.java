package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class n189_RotateArrayTest{
     
    n189_RotateArray clz = new n189_RotateArray();
    int[] nums;
    int k;
    int[] expected;

    @Test
    public void test1(){
        nums = new int[]{1,2,3,4,5,6,7};
        k = 3;
        clz.rotate(nums, k);
        expected = new int[]{5,6,7,1,2,3,4};
        assertArrayEquals(nums, expected);
    }

    @Test
    public void test2(){
        nums = new int[]{-1,-100,3,99};
        k = 2;
        clz.rotate(nums, k);
        expected = new int[]{3,99,-1,-100};
        assertArrayEquals(nums, expected);
    }

    @Test
    public void test3(){
        nums = new int[]{-1};
        k = 2;
        clz.rotate(nums, k);
        expected = new int[]{-1};
        assertArrayEquals(expected, nums);
    }
}
