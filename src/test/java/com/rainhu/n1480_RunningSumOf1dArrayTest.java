package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class n1480_RunningSumOf1dArrayTest {
    
    n1480_RunningSumOf1dArray clz = new n1480_RunningSumOf1dArray();
    int[] nums;
    int[] expected, actual;

    @Test
    public void test1(){
        nums = new int[]{1,2,3,4};
        expected = new int[]{1,3,6,10};
        actual = clz.runningSum(nums);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void test2(){
        nums = new int[]{1,1,1,1,1};
        expected = new int[]{1,2,3,4,5};
        actual = clz.runningSum(nums);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void test3(){
        nums = new int[]{3,1,2,10,1};
        expected = new int[]{3,4,6,16,17};
        actual = clz.runningSum(nums);
        assertArrayEquals(expected, actual);
    }
}
