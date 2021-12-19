package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n1413_MinimumValueToGetPositiveStepByStepSumTest {
    
    n1413_MinimumValueToGetPositiveStepByStepSum clz = new n1413_MinimumValueToGetPositiveStepByStepSum();
    int[] nums;
    int expected;
    int actual;

    @Test
    public void test1(){
        nums = new int[]{-3,2,-3,4,2};
        expected = 5;
        actual = clz.minStartValue(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        nums = new int[]{1,2};
        expected = 1;
        actual = clz.minStartValue(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        nums = new int[]{1,-2,-3};
        expected = 5;
        actual = clz.minStartValue(nums);
        assertEquals(expected, actual);
    }
}
