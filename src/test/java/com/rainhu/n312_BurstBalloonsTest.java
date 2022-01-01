package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n312_BurstBalloonsTest{

    n312_BurstBalloons clz = new n312_BurstBalloons();
    int[] nums;
    int expected;
    int actual;

    @Test
    public void test1(){
        nums = new int[]{3,1,5,8};
        expected = 167;
        actual = clz.maxCoins(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        nums = new int[]{1,5};
        expected = 10;
        actual = clz.maxCoins(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        nums = new int[]{3,1,5,8,7};
        expected = 428;
        actual = clz.maxCoins(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void test4(){
        nums = new int[]{1,4,2,8,7,6,5,3,9,11,10};
        expected = 3441;
        actual = clz.maxCoins(nums);
        assertEquals(expected, actual);
    }
}