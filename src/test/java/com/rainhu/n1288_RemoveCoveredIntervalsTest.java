package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n1288_RemoveCoveredIntervalsTest {
    
    n1288_RemoveCoveredIntervals clz = new n1288_RemoveCoveredIntervals();
    int[][] intervals;
    int expected, actual;

    @Test
    public void test1(){
        intervals = new int[][]{{1,4},{3,6},{2,8}};
        expected = 2;
        actual = clz.removeCoveredIntervals(intervals);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        intervals = new int[][]{{1,4},{2,3}};
        expected = 1;
        actual = clz.removeCoveredIntervals(intervals);
        assertEquals(expected, actual);
    }
}
