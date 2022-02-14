package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n41_FirstMissingPositiveTest {
    
    n41_FirstMissingPositive clz = new n41_FirstMissingPositive();
    int[] nums;
    int expected, actual;

    @Test
    public void test1(){
        nums = new int[]{1,1};
        expected = 2;
        actual = clz.firstMissingPositive(nums);
        assertEquals(expected, actual);
    }
    @Test
    public void test2(){
        nums = new int[]{1,2,0};
        expected = 3;
        actual = clz.firstMissingPositive(nums);
        assertEquals(expected, actual);
    }
    @Test
    public void test3(){
        nums = new int[]{3,4,-1,1};
        expected = 2;
        actual = clz.firstMissingPositive(nums);
        assertEquals(expected, actual);
    }
    @Test
    public void test4(){
        nums = new int[]{7,8,9,11,12};
        expected = 1;
        actual = clz.firstMissingPositive(nums);
        assertEquals(expected, actual);
    }
}
