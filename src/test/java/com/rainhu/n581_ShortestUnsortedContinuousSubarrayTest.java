package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n581_ShortestUnsortedContinuousSubarrayTest {
    
    n581_ShortestUnsortedContinuousSubarray clz = new n581_ShortestUnsortedContinuousSubarray();
    int[] nums;
    int expected, actual;

    @Test
    public void test1(){
        nums = new int[]{2,6,4,8,10,9,15};
        expected = 5;
        actual = clz.findUnsortedSubarray(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        nums = new int[]{1,2,3,4};
        expected = 0;
        actual = clz.findUnsortedSubarray(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        nums = new int[]{1};
        expected = 0;
        actual = clz.findUnsortedSubarray(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void test4(){
        nums = new int[]{1,3,2,2,2};
        expected = 4;
        actual = clz.findUnsortedSubarray(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void test5(){
        nums = new int[]{1,3,2,3,3};
        expected = 4;
        actual = clz.findUnsortedSubarray(nums);
        assertEquals(expected, actual);
    }
}
