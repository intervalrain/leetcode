package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n494_TargetSumTest {
    
    n494_TargetSum clz = new n494_TargetSum();
    int[] nums;
    int target;
    int expected, actual;
    
    
    @Test
    public void test1(){
        nums = new int[]{1,1,1,1,1};
        target = 3;
        expected = 5;
        actual = clz.findTargetSumWays(nums, target);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        nums = new int[]{1};
        target = 1;
        expected = 1;
        actual = clz.findTargetSumWays(nums, target);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        nums = new int[]{1,1,2,3,5,6,8};
        target = 4;
        expected = 8;
        actual = clz.findTargetSumWays(nums, target);
        assertEquals(expected, actual);
    }
}
