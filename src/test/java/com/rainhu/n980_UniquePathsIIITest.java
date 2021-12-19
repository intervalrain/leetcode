package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n980_UniquePathsIIITest {
    n980_UniquePathsIII clz = new n980_UniquePathsIII();
    int[][] grid;
    int expected;
    int actual;

    @Test
    public void test1(){
        grid = new int[][]{{1,0,0,0},{0,0,0,0},{0,0,2,-1}};
        expected = 2;
        actual = clz.uniquePathsIII(grid);
        assertEquals(expected, actual);
    }
    @Test
    public void test2(){
        grid = new int[][]{{1,0,0,0},{0,0,0,0},{0,0,0,2}};
        expected = 4;
        actual = clz.uniquePathsIII(grid);
        assertEquals(expected, actual);
    }
    @Test
    public void test3(){
        grid = new int[][]{{0,1},{2,0}};
        expected = 0;
        actual = clz.uniquePathsIII(grid);
        assertEquals(expected, actual);
    }
}
