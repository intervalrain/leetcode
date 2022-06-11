package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n1658_MinimumOperationsToReduceXtoZeroTest {
    
    n1658_MinimumOperationsToReduceXtoZero clz = new n1658_MinimumOperationsToReduceXtoZero();
    int[] nums;
    int x;
    int expected, actual;

    @Test
    public void test1(){
        nums = new int[]{1,1,4,2,3};
        x = 5;
        expected = 2;
        actual = clz.minOperations(nums, x);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        nums = new int[]{5,6,7,8,9};
        x = 4;
        expected = -1;
        actual = clz.minOperations(nums, x);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        nums = new int[]{3,2,20,1,1,3};
        x = 10;
        expected = 5;
        actual = clz.minOperations(nums, x);
        assertEquals(expected, actual);
    }

}
