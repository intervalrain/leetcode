package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n287_FindTheDuplicateNumberTest {
    
    n287_FindTheDuplicateNumber clz = new n287_FindTheDuplicateNumber();
    int[] nums;
    int expected, actual;

    @Test
    public void test1(){
        nums = new int[]{1,3,4,2,2};
        expected = 2;
        actual = clz.findDuplicate(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        nums = new int[]{3,1,3,4,2};
        expected = 3;
        actual = clz.findDuplicate(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        nums = new int[]{2,2,2,2,2};
        expected = 2;
        actual = clz.findDuplicate(nums);
        assertEquals(expected, actual);
    }
}
