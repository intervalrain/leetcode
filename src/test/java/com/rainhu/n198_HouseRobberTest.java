package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n198_HouseRobberTest {

    n198_HouseRobber clz = new n198_HouseRobber();
    int[] nums;
    int expected;
    int actual;

    @Test
    public void test1(){
        nums = new int[]{1,2,3,1};
        expected = 4;
        actual = clz.rob(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        nums = new int[]{2,7,9,3,1};
        expected = 12;
        actual = clz.rob(nums);
        assertEquals(expected, actual);
    }
    
}