package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n42_TrappingRainWaterTest {
    n42_TrappingRainWater clz = new n42_TrappingRainWater();
    int[] height;
    int expected, actual;

    @Test
    public void test1(){
        height = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
        expected = 6;
        actual = clz.trap(height);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        height = new int[]{4,2,0,3,2,5};
        expected = 9;
        actual = clz.trap(height);
        assertEquals(expected, actual);
    }
}
