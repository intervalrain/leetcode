package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class n1_TwoSumTest {
    
    n1_TwoSum clz = new n1_TwoSum();

    int[] nums;
    int target;
    int[] actual, expected;
    
    @Test
    public void test1(){
        nums = new int[]{2,7,11,15};
        target = 9;
        actual = clz.twoSum(nums, target);
        Arrays.sort(actual);
        expected = new int[]{0,1};
        assertArrayEquals(expected, actual);
    }
    @Test
    public void test2(){
        nums = new int[]{3,2,4};
        target = 6;
        actual = clz.twoSum(nums, target);
        Arrays.sort(actual);
        expected = new int[]{1,2};
        assertArrayEquals(expected, actual);
    }
    @Test
    public void test3(){
        nums = new int[]{3,3};
        target = 6;
        actual = clz.twoSum(nums, target);
        Arrays.sort(actual);
        expected = new int[]{0,1};
        assertArrayEquals(expected, actual);
    }
}
