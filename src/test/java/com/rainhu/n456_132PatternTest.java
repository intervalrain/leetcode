package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n456_132PatternTest {

    n456_132Pattern clz = new n456_132Pattern();
    int[] nums;
    boolean expected, actual;

    @Test
    public void test1(){
        nums = new int[]{1,2,3,4};
        expected = false;
        actual = clz.find132pattern(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        nums = new int[]{3,1,4,2};
        expected = true;
        actual = clz.find132pattern(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        nums = new int[]{-1,3,2,0};
        expected = true;
        actual = clz.find132pattern(nums);
        assertEquals(expected, actual);
    }


    @Test
    public void test4(){
        nums = new int[]{3,5,0,3,4};
        expected = true;
        actual = clz.find132pattern(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void test5(){
        nums = new int[]{1,2,3,3,3,4,5,3};
        expected = true;
        actual = clz.find132pattern(nums);
        assertEquals(expected, actual);
    }
}
