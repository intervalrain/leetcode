package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class n56_MergeIntervalsTest{

    n56_MergeIntervals clz = new n56_MergeIntervals();
    int[][] intervals;
    int[][] expected;
    int[][] actual;

    @Test
    public void test1(){
        intervals = new int[][]{{1,3},{2,6},{8,10},{15,18}};
        expected = new int[][]{{1,6},{8,10},{15,18}};
        actual = clz.merge(intervals);
        assertTrue(expected.length == actual.length);
        for (int i = 0; i < expected.length; i++){
            assertArrayEquals(expected[i], actual[i]);
        }
    }

    @Test
    public void test2(){
        intervals = new int[][]{{1,4},{4,5}};
        expected = new int[][]{{1,5}};
        actual = clz.merge(intervals);
        assertTrue(expected.length == actual.length);
        for (int i = 0; i < expected.length; i++){
            assertArrayEquals(expected[i], actual[i]);
        }
    }
}