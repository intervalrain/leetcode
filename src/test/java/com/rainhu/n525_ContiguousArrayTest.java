package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n525_ContiguousArrayTest {
    
    n525_ContiguousArray clz = new n525_ContiguousArray();
    int[] nums;
    int expected;
    int actual;

    @Test
    public void test1(){
        nums = new int[]{0,1};
        expected = 2;
        actual = clz.findMaxLength(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        nums = new int[]{0,1,0};
        expected = 2;
        actual = clz.findMaxLength(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        nums = new int[]{0,0,1,0,1,0,0,1,1,0};
        expected = 8;
        actual = clz.findMaxLength(nums);
        assertEquals(expected, actual);
    }
}
