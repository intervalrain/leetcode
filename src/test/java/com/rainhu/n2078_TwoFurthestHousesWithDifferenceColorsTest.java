package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n2078_TwoFurthestHousesWithDifferenceColorsTest {
    
    n2078_TwoFurthestHousesWithDifferenceColors clz = new n2078_TwoFurthestHousesWithDifferenceColors();
    int[] colors;
    int expected;
    int actual;

    @Test
    public void test1(){
        colors = new int[]{1,1,1,6,1,1,1};
        expected = 3;
        actual = clz.maxDistance(colors);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        colors = new int[]{1,8,3,8,3};
        expected = 4;
        actual = clz.maxDistance(colors);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        colors = new int[]{0,1};
        expected = 1;
        actual = clz.maxDistance(colors);
        assertEquals(expected, actual);
    }
}
