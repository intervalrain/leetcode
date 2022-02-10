package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n560_SubarraySumEqualsKTest {
    
    n560_SubarraySumEqualsK clz = new n560_SubarraySumEqualsK();

    int[] nums;
    int k;
    int expected, actual;

    @Test
    public void test1(){
        nums = new int[]{1,1,1};
        k = 2;
        expected = 2;
        actual = clz.subarraySum(nums, k);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        nums = new int[]{1,2,3};
        k = 3;
        expected = 2;
        actual = clz.subarraySum(nums, k);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        nums = new int[]{1,2,1,2,1};
        k = 3;
        expected = 4;
        actual = clz.subarraySum(nums, k);
        assertEquals(expected, actual);
    }

    @Test
    public void test4(){
        nums = new int[]{1,-1,0};
        k = 0;
        expected = 3;
        actual = clz.subarraySum(nums, k);
        assertEquals(expected, actual);
    }

}
