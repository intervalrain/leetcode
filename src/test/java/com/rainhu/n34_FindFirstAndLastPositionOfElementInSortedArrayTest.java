package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class n34_FindFirstAndLastPositionOfElementInSortedArrayTest {
    
    n34_FindFirstAndLastPositionOfElementInSortedArray clz = new n34_FindFirstAndLastPositionOfElementInSortedArray();
    int[] nums;
    int target;
    int[] expected;
    int[] actual;

    @Test
    public void test1(){
        nums = new int[]{5,7,7,8,8,10};
        target = 8;
        expected = new int[]{3,4};
        actual = clz.searchRange(nums, target);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void test2(){
        nums = new int[]{5,7,7,8,8,10};
        target = 6;
        expected = new int[]{-1,-1};
        actual = clz.searchRange(nums, target);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void test3(){
        nums = new int[]{};
        target = 0;
        expected = new int[]{-1,-1};
        actual = clz.searchRange(nums, target);
        assertArrayEquals(expected, actual);
    }

}
