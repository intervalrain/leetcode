package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n329_LongestIncreasingPathInAMatrixTest {
    
    n329_LongestIncreasingPathInAMatrix clz = new n329_LongestIncreasingPathInAMatrix();
    int[][] matrix;
    int expected, actual;

    @Test
    public void test1(){
        int[][] matrix = new int[][]{{9,9,4},{6,6,8},{2,1,1}};
        expected = 4;
        actual = clz.longestIncreasingPath(matrix);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        int[][] matrix = new int[][]{{3,4,5},{3,2,6},{2,2,1}};
        expected = 4;
        actual = clz.longestIncreasingPath(matrix);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        int[][] matrix = new int[][]{{1}};
        expected = 1;
        actual = clz.longestIncreasingPath(matrix);
        assertEquals(expected, actual);
    }
}
