package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n952_LargestComponentSizeByCommonFactorTest {
    
    n952_LargestComponentSizeByCommonFactor clz = new n952_LargestComponentSizeByCommonFactor();

    int[] nums;
    int expected;
    int actual;

    @Test
    public void test1(){
        nums = new int[]{4,6,15,35};
        expected = 4;
        actual = clz.largestComponentSize(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        nums = new int[]{20,50,9,63};
        expected = 2;
        actual = clz.largestComponentSize(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        nums = new int[]{2,3,6,7,4,12,21,39}; 
        expected = 8;
        actual = clz.largestComponentSize(nums);
        assertEquals(expected, actual);
    }
}
