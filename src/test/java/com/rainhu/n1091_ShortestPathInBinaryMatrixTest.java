package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n1091_ShortestPathInBinaryMatrixTest {
    
    n1091_ShortestPathInBinaryMatrix clz = new n1091_ShortestPathInBinaryMatrix();
    int[][] grid;
    int expected, actual;

    @Test
    public void test1(){
        grid = new int[][]{{0,1},{1,0}};
        expected = 2;
        actual = clz.shortestPathBinaryMatrix(grid);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        grid = new int[][]{{0,0,0},{1,1,0},{1,1,0}};
        expected = 4;
        actual = clz.shortestPathBinaryMatrix(grid);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        grid = new int[][]{{1,0,0},{1,1,0},{1,1,0}};
        expected = -1;
        actual = clz.shortestPathBinaryMatrix(grid);
        assertEquals(expected, actual);
    }

    @Test
    public void test4(){
        grid = new int[][]{{0,1,0,0,0,0},
                           {0,1,0,1,1,0},
                           {0,1,1,0,1,0},
                           {0,0,0,0,1,0},
                           {1,1,1,1,1,0},
                           {1,1,1,1,1,0}};
        expected = 14;
        actual = clz.shortestPathBinaryMatrix(grid);
        assertEquals(expected, actual);
    }

    @Test
    public void test5(){
        grid = new int[][]{{0,1,0,1,0},
                           {1,0,0,0,1},
                           {0,0,1,1,1},
                           {0,0,0,0,0},
                           {1,0,1,0,0}};
        expected = 6;
        actual = clz.shortestPathBinaryMatrix(grid);
        assertEquals(expected, actual);
    }
}
