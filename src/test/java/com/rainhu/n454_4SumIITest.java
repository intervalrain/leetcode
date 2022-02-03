package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n454_4SumIITest {
    
    n454_4SumII clz = new n454_4SumII();
    int[] nums1, nums2, nums3, nums4;
    int expected, actual;

    @Test
    public void test1(){
        nums1 = new int[]{1,2};
        nums2 = new int[]{-2,-1};
        nums3 = new int[]{-1,2};
        nums4 = new int[]{0,2};
        expected = 2;
        actual = clz.fourSumCount(nums1, nums2, nums3, nums4);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        nums1 = new int[]{0};
        nums2 = new int[]{0};
        nums3 = new int[]{0};
        nums4 = new int[]{0};
        expected = 1;
        actual = clz.fourSumCount(nums1, nums2, nums3, nums4);
        assertEquals(expected, actual);
    }
}
