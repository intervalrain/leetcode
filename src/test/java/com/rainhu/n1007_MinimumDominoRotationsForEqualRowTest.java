package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n1007_MinimumDominoRotationsForEqualRowTest {
    
    n1007_MinimumDominoRotationsForEqualRow clz = new n1007_MinimumDominoRotationsForEqualRow();
    int[] tops, bottoms;
    int expected, actual;

    @Test
    public void test1(){
        tops = new int[]{2,1,2,4,2,2};
        bottoms = new int[]{5,2,6,2,3,2};
        actual = clz.minDominoRotations(tops, bottoms);
        expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        tops = new int[]{3,5,1,2,3};
        bottoms = new int[]{3,6,3,3,4};
        actual = clz.minDominoRotations(tops, bottoms);
        expected = -1;
        assertEquals(expected, actual);
    }
}
