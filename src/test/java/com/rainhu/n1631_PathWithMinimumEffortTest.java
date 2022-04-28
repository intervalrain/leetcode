package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n1631_PathWithMinimumEffortTest {
    
    n1631_PathWithMinimumEffort clz = new n1631_PathWithMinimumEffort();
    int[][] heights;
    int expected, actual;

    @Test
    public void test1(){
        heights = new int[][]{{1,2,2},{3,8,2},{5,3,5}};
        expected = 2;
        actual = clz.minimumEffortPath(heights);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        heights = new int[][]{{1,2,3},{3,8,4},{5,3,5}};
        expected = 1;
        actual = clz.minimumEffortPath(heights);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        heights = new int[][]{{1,2,1,1,1},{1,2,1,2,1},{1,2,1,2,1},{1,2,1,2,1},{1,2,1,2,1},{1,1,1,2,1}};
        expected = 0;
        actual = clz.minimumEffortPath(heights);
        assertEquals(expected, actual);
    }
}
