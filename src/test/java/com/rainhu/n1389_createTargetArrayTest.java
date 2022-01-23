package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class n1389_CreateTargetArrayTest {
    
    n1389_CreateTargetArray clz = new n1389_CreateTargetArray();

    int[] nums;
    int[] index;
    int[] actual, expected;

    @Test
    public void test1(){
        nums = new int[]{0,1,2,3,4};
        index = new int[]{0,1,2,2,1};
        actual = clz.createTargetArray(nums, index);
        expected = new int[]{0,4,1,3,2};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void test2(){
        nums = new int[]{1,2,3,4,0};
        index = new int[]{0,1,2,3,0};
        actual = clz.createTargetArray(nums, index);
        expected = new int[]{0,1,2,3,4};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void test3(){
        nums = new int[]{1};
        index = new int[]{0};
        actual = clz.createTargetArray(nums, index);
        expected = new int[]{1};
        assertArrayEquals(expected, actual);
    }
}
