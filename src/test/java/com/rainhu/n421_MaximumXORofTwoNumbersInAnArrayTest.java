package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n421_MaximumXORofTwoNumbersInAnArrayTest {
    
    n421_MaximumXORofTwoNumbersInAnArray clz = new n421_MaximumXORofTwoNumbersInAnArray();
    int[] nums;
    int expected;
    int actual;

    @Test
    public void test1(){
        nums = new int[]{3,10,5,25,2,8};
        expected = 28;
        actual = clz.findMaximumXOR(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        nums = new int[]{14,70,53,83,49,91,36,80,92,51,66,70};
        expected = 127;
        actual = clz.findMaximumXOR(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        nums = new int[]{2147483647, 2147483646, 2147483645};
        expected = 3;
        actual = clz.findMaximumXOR(nums);
        assertEquals(expected, actual);
    }
}
