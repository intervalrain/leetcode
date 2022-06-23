package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n1642_FurthestBuildingYouCanReachTest {
    
    n1642_FurthestBuildingYouCanReach clz = new n1642_FurthestBuildingYouCanReach();
    int[] heights;
    int bricks, ladders;
    int expected, actual;

    @Test
    public void test1(){
        heights = new int[]{4,2,7,6,9,14,12};
        bricks = 5;
        ladders = 1;
        expected = 4;
        actual = clz.furthestBuilding(heights, bricks, ladders);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        heights = new int[]{4,12,2,7,3,18,20,3,19};
        bricks = 10;
        ladders = 2;
        expected = 7;
        actual = clz.furthestBuilding(heights, bricks, ladders);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        heights = new int[]{14,3,19,3};
        bricks = 17;
        ladders= 0;
        expected = 3;
        actual = clz.furthestBuilding(heights, bricks, ladders);
        assertEquals(expected, actual);
    }
}
