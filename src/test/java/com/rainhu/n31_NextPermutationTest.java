package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class n31_NextPermutationTest {
    
    n31_NextPermutation clz = new n31_NextPermutation();
    int[] nums, expected;

    @Test
    public void test1(){
        nums = new int[]{1,2,3};
        expected = new int[]{1,3,2};
        clz.nextPermutation(nums);
        assertArrayEquals(expected, nums);
    }

    @Test
    public void test2(){
        nums = new int[]{3,2,1};
        expected = new int[]{1,2,3};
        clz.nextPermutation(nums);
        assertArrayEquals(expected, nums);
    }

    @Test
    public void test3(){
        nums = new int[]{1,1,5};
        expected = new int[]{1,5,1};
        clz.nextPermutation(nums);
        assertArrayEquals(expected, nums);
    }
}
