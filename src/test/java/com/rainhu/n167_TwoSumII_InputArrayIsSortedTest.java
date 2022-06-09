package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class n167_TwoSumII_InputArrayIsSortedTest {
    
    n167_TwoSumII_InputArrayIsSorted clz = new n167_TwoSumII_InputArrayIsSorted();
    int[] numbers;
    int target;
    int[] expected, actual;

    @Test
    public void test1(){
        numbers = new int[]{2,7,11,15};
        target = 9;
        expected = new int[]{1,2};
        actual = clz.twoSum(numbers, target);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void test2(){
        numbers = new int[]{2,3,4};
        target = 6;
        expected = new int[]{1,3};
        actual = clz.twoSum(numbers, target);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void test3(){
        numbers = new int[]{-1,0};
        target = -1;
        expected = new int[]{1,2};
        actual = clz.twoSum(numbers, target);
        assertArrayEquals(expected, actual);
    }
}
