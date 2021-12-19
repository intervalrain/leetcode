package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class n238_ProductOfArrayExceptSelfTest {
    
    n238_ProductOfArrayExceptSelf clz = new n238_ProductOfArrayExceptSelf();
    int[] nums;
    int[] expected;
    int[] actual;

    @Test
    public void test1(){
        nums = new int[]{1,2,3,4};
        expected = new int[]{24,12,8,6};
        actual = clz.productExceptSelf(nums);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void test2(){
        nums = new int[]{-1,1,0,-3,3};
        expected = new int[]{0,0,9,0,0};
        actual = clz.productExceptSelf(nums);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void test3(){
        nums = new int[]{0,0};
        expected = new int[]{0,0};
        actual = clz.productExceptSelf(nums);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void test4(){
        nums = new int[]{0,4,0};
        expected = new int[]{0,0,0};
        actual = clz.productExceptSelf(nums);
        assertArrayEquals(expected, actual);
    }
}
