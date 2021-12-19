package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n35_SearchInsertPositionTest {
    
    n35_SearchInsertPosition clz = new n35_SearchInsertPosition();

    int[] nums;
    int target;
    int expected;
    int actual;

    @Test
    public void test1(){
        nums = new int[]{1,3,5,6};
        target = 5;
        expected = 2;
        actual = clz.searchInsert(nums, target);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        nums = new int[]{1,3,5,6};
        target = 2;
        expected = 1;
        actual = clz.searchInsert(nums, target);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        nums = new int[]{1,3,5,6};
        target = 7;
        expected = 4;
        actual = clz.searchInsert(nums, target);
        assertEquals(expected, actual);
    }

    @Test
    public void test4(){
        nums = new int[]{1,3,5,6};
        target = 0;
        expected = 0;
        actual = clz.searchInsert(nums, target);
        assertEquals(expected, actual);
    }

    @Test
    public void test5(){
        nums = new int[]{1};
        target = 0;
        expected = 0;
        actual = clz.searchInsert(nums, target);
        assertEquals(expected, actual);
    }

    
}
