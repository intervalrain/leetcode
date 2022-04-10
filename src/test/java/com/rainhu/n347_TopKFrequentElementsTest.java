package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class n347_TopKFrequentElementsTest {
    
    n347_TopKFrequentElements clz = new n347_TopKFrequentElements();
    int[] nums;
    int k;
    int[] expected, actual;

    @Test
    public void test1(){
        nums = new int[]{1,1,1,2,2,3};
        k = 2;
        expected = new int[]{1,2};
        actual = clz.topKFrequent(nums, k);
        Arrays.sort(actual);
        Arrays.sort(expected);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void test2(){
        nums = new int[]{1};
        k = 1;
        expected = new int[]{1};
        actual = clz.topKFrequent(nums, k);
        Arrays.sort(actual);
        Arrays.sort(expected);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void test3(){
        nums = new int[]{1,1,1,2,2,3,3,3,4,4,4,4,4,5,6,7,8,9,9,9};
        k = 4;
        expected = new int[]{4,1,3,9};
        actual = clz.topKFrequent(nums, k);
        Arrays.sort(actual);
        Arrays.sort(expected);
        assertArrayEquals(expected, actual);
    }
}
