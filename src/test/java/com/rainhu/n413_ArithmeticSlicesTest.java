package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n413_ArithmeticSlicesTest {
    
    n413_ArithmeticSlices clz = new n413_ArithmeticSlices();
    int[] nums;
    int expected, actual;

    @Test
    public void test1(){
        nums = new int[]{1,2,3,4};
        expected = 3;
        actual = clz.numberOfArithmeticSlices(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        nums = new int[]{1};
        expected = 0;
        actual = clz.numberOfArithmeticSlices(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        nums = new int[]{1,2,3};
        expected = 1;
        actual = clz.numberOfArithmeticSlices(nums);
        assertEquals(expected, actual);
    }
}
