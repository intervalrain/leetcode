package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n215_KthLargestElementInAnArrayTest {
    
    n215_KthLargestElementInAnArray clz = new n215_KthLargestElementInAnArray();
    int[] nums;
    int k;
    int expected, actual;

    @Test
    public void test1(){
        nums = new int[]{3,2,1,5,6,4};
        k = 2;
        expected = 5;
        actual = clz.findKthLargest(nums, k);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        nums = new int[]{3,2,3,1,2,4,5,5,6};
        k = 4;
        expected = 4;
        actual = clz.findKthLargest(nums, k);
        assertEquals(expected, actual);
    }
}
