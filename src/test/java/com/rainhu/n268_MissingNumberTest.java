package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n268_MissingNumberTest {
    
    n268_MissingNumber clz = new n268_MissingNumber();
    int[] nums;
    int expected, actual;

    @Test
    public void test1(){
        nums = new int[]{3,0,1};
        expected = 2;
        actual = clz.missingNumber(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        nums = new int[]{0,1};
        expected = 2;
        actual = clz.missingNumber(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        nums = new int[]{9,6,4,2,3,5,7,0,1};
        expected = 8;
        actual = clz.missingNumber(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void test4(){
        nums = new int[]{9,6,4,2,3,8,7,0,1};
        expected = 5;
        actual = clz.missingNumber(nums);
        assertEquals(expected, actual);
    }
}
