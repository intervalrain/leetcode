package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n11_ContainerWithMostWaterTest {

    n11_ContainerWithMostWater clz = new n11_ContainerWithMostWater();
    int[] height;
    int actual, expected;

    @Test
    public void test1(){
        height = new int[]{1,8,6,2,5,4,8,3,7};
        actual = clz.maxArea(height);
        expected = 49;
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        height = new int[]{1,1};
        actual = clz.maxArea(height);
        expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        height = new int[]{4,3,2,1,4};
        actual = clz.maxArea(height);
        expected = 16;
        assertEquals(expected, actual);
    }

    @Test
    public void test4(){
        height = new int[]{1,2,1};
        actual = clz.maxArea(height);
        expected = 2;
        assertEquals(expected, actual);
    }
}