package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class n88_MergeSortedArrayTest {

    n88_MergeSortedArray clz = new n88_MergeSortedArray();
    int[] nums1, nums2;
    int m, n;

    @Test
    public void test1(){
        nums1 = new int[]{1,2,3,0,0,0};
        nums2 = new int[]{2,5,6};
        m = 3;
        n = 3;
        clz.merge(nums1, m, nums2, n);
        assertArrayEquals(nums1, new int[]{1,2,2,3,5,6});
    }

    @Test
    public void test2(){
        nums1 = new int[]{1};
        nums2 = new int[]{};
        m = 1;
        n = 0;
        clz.merge(nums1, m, nums2, n);
        assertArrayEquals(nums1, new int[]{1});
    }

    @Test
    public void test3(){
        nums1 = new int[]{0};
        nums2 = new int[]{1};
        m = 0;
        n = 1;
        clz.merge(nums1, m, nums2, n);
        assertArrayEquals(nums1, new int[]{1});
    }
}
