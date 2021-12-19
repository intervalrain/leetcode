package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class n260_SingleNumberIIITest {

    n260_SingleNumberIII clz = new n260_SingleNumberIII();
    int[] nums;
    int[] expected;
    int[] actual;

    @Test
    public void test1(){
        nums = new int[]{1,2,1,3,2,5};
        expected = new int[]{3,5};
        actual = clz.singleNumber(nums);
        Arrays.sort(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void test2(){
        nums = new int[]{-1,0};
        expected = new int[]{-1,0};
        actual = clz.singleNumber(nums);
        Arrays.sort(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void test3(){
        nums = new int[]{0, 1};
        expected = new int[]{0,1};
        actual = clz.singleNumber(nums);
        Arrays.sort(actual);
        assertArrayEquals(expected, actual);
    }
}

