package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n4_MedianOfTwoSortedArraysTest {

    n4_MedianOfTwoSortedArrays clz = new n4_MedianOfTwoSortedArrays();
    
    int[] nums1, nums2;
    double actual, expected;

    @Test
    public void test1(){
        nums1 = new int[]{1,3};
        nums2 = new int[]{2};
        actual = clz.findMedianSortedArrays(nums1, nums2);
        expected = 2.0000;
        assertEquals(actual, expected);
    }
    @Test
    public void test2(){
        nums1 = new int[]{1,2};
        nums2 = new int[]{3,4};
        actual = clz.findMedianSortedArrays(nums1, nums2);
        expected = 2.5000;
        assertEquals(actual, expected);
    }
    @Test
    public void test3(){
        nums1 = new int[]{0,0};
        nums2 = new int[]{0,0};
        actual = clz.findMedianSortedArrays(nums1, nums2);
        expected = 0.0000;
        assertEquals(actual, expected);
    }
    @Test
    public void test4(){
        nums1 = new int[]{};
        nums2 = new int[]{1};
        actual = clz.findMedianSortedArrays(nums1, nums2);
        expected = 1.0000;
        assertEquals(actual, expected);
    }
    @Test
    public void test5(){
        nums1 = new int[]{};
        nums2 = new int[]{1};
        actual = clz.findMedianSortedArrays(nums1, nums2);
        expected = 1.0000;
        assertEquals(actual, expected);
    }
}
