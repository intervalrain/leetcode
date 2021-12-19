package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n704_BinarySearchTest {
    
    n704_BinarySearch clz = new n704_BinarySearch();

    int[] nums;
    int target;
    int actual, expected;

    @Test
    public void test1(){
        nums = new int[]{-1,0,3,5,9,12};
        target = 9;
        expected = 4;
        actual = clz.search(nums, target);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        nums = new int[]{-1,0,3,5,9,12};
        target = 2;
        expected = -1;
        actual = clz.search(nums, target);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        nums = new int[]{5};
        target = -5;
        expected = -1;
        actual = clz.search(nums, target);
        assertEquals(expected, actual);
    }
}
