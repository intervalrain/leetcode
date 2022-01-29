package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n84_LargestRectangleInHistogramTest{

    n84_LargestRectangleInHistogram clz = new n84_LargestRectangleInHistogram();
    int[] heights;
    int expected;
    int actual;

    @Test
    public void test1(){
        heights = new int[]{2,1,5,6,2,3};
        expected = 10;
        actual = clz.largestRectangleArea(heights);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        heights = new int[]{2,4};
        expected = 4;
        actual = clz.largestRectangleArea(heights);
        assertEquals(expected, actual);
    }

}