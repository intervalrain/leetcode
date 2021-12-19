package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n152_MaximumProductArrayTest {
    
    n152_MaximumProductArray clz = new n152_MaximumProductArray();
    int[] nums;
    int expected;
    int actual;

    @Test
    public void test1(){
        nums = new int[]{2,3,-2,4};
        expected = 6;
        actual = clz.maxProduct(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        nums = new int[]{-2,0,-1};
        expected = 0;
        actual = clz.maxProduct(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        nums = new int[]{1,3,2,4,0,1,3,2,4};
        expected = 24;
        actual = clz.maxProduct(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void test4(){
        nums = new int[]{0,2};
        expected = 2;
        actual = clz.maxProduct(nums);
        assertEquals(expected, actual);
    }
}
