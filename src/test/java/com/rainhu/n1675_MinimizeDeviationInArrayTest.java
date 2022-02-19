package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n1675_MinimizeDeviationInArrayTest {
    
    n1675_MinimizeDeviationInArray clz = new n1675_MinimizeDeviationInArray();
    int[] nums;
    int expected, actual;

    @Test
    public void test1(){
        nums = new int[]{1,2,3,4};
        expected = 1;
        actual = clz.minimumDeviation(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        nums = new int[]{4,1,5,20,3};
        expected = 3;
        actual = clz.minimumDeviation(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        nums = new int[]{2,10,8};
        expected = 3;
        actual = clz.minimumDeviation(nums);
        assertEquals(expected, actual);
    }
}
