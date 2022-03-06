package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n740_DeleteAndEarnTest {
    
    n740_DeleteAndEarn clz = new n740_DeleteAndEarn();
    int[] nums;
    int expected, actual;

    @Test
    public void test1(){
        nums = new int[]{3,4,2};
        expected = 6;
        actual = clz.deleteAndEarn(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        nums = new int[]{2,2,3,3,3,4};
        expected = 9;
        actual = clz.deleteAndEarn(nums);
        assertEquals(expected, actual);
    }
}