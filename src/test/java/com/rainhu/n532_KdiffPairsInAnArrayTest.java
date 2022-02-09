package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n532_KdiffPairsInAnArrayTest {
    
    n532_KdiffPairsInAnArray clz = new n532_KdiffPairsInAnArray();
    int[] nums;
    int k;
    int expected, actual;

    @Test
    public void test1(){
        nums = new int[]{3,1,4,1,5};
        k = 2;
        expected = 2;
        actual = clz.findPairs(nums, k);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        nums = new int[]{1,2,3,4,5};
        k = 1;
        expected = 4;
        actual = clz.findPairs(nums, k);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        nums = new int[]{1,2,4,4,3,3,0,9,2,3};
        k = 3;
        expected = 2;
        actual = clz.findPairs(nums, k);
        assertEquals(expected, actual);
    }

    @Test
    public void test4(){
        nums = new int[]{1,3,1,5,4};
        k = 0;
        expected = 1;
        actual = clz.findPairs(nums, k);
        assertEquals(expected, actual);
    }
}
