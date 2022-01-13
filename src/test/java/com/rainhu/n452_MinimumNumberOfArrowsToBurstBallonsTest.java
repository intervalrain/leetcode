package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n452_MinimumNumberOfArrowsToBurstBallonsTest{

    n452_MinimumNumberOfArrowsToBurstBalloons clz = new n452_MinimumNumberOfArrowsToBurstBalloons();
    int[][] points;
    int expected;
    int actual;
    
    @Test
    public void test1(){
        points = new int[][]{{10,16}, {2,8}, {1,6}, {7,12}};
        expected = 2;
        actual = clz.findMinArrowShots(points);
        assertEquals(expected, actual);;
    }

    @Test
    public void test2(){
        points = new int[][]{{1,2},{3,4},{5,6},{7,8}};
        expected = 4;
        actual = clz.findMinArrowShots(points);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        points = new int[][]{{1,2}, {2,3}, {3,4}, {4,5}};
        expected = 2;
        actual = clz.findMinArrowShots(points);
        assertEquals(expected, actual);
    }

    @Test
    public void test4(){
        points = new int[][]{{-2147483646, -2147483645}, {2147483646, 2147483647}};
        expected = 2;
        actual = clz.findMinArrowShots(points);
        assertEquals(expected, actual);
    }

    @Test
    public void test5(){
        points = new int[][]{{9,12},{1,10},{4,11},{8,12},{3,9},{6,9},{6,7}};
        expected = 2;
        actual = clz.findMinArrowShots(points);
        assertEquals(expected, actual);
    }

    @Test
    public void test6(){
        int[][] points = new int[][]{{3,9},{7,12},{3,8},{6,8},{9,10},{2,9},{0,9},{3,9},{0,6},{2,8}};
        expected = 5;
        actual = clz.findMinArrowShots(points);
        assertEquals(expected, actual);
    }
}