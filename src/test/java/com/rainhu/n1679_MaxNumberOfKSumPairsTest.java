package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n1679_MaxNumberOfKSumPairsTest {
    
    n1679_MaxNumberOfKSumPairs clz = new n1679_MaxNumberOfKSumPairs();
    int[] nums;
    int k;
    int expected, actual;
    @Test
    public void test1(){
        nums = new int[]{1,2,3,4};
        k = 5;
        expected = 2;
        actual = clz.maxOperations(nums, k);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        nums = new int[]{3,1,3,4,3};
        k = 6;
        expected = 1;
        actual = clz.maxOperations(nums, k);
        assertEquals(expected, actual);
    }
}
