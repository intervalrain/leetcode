package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n63_UniquePathIITest {
    
    n63_UniquePathII clz = new n63_UniquePathII();
    int[][] obstacleGrid;
    int expected, actual;

    @Test
    public void test1(){
        obstacleGrid = new int[][]{{0,0,0},{0,1,0},{0,0,0}};
        expected = 2;
        actual = clz.uniquePathsWithObstacles(obstacleGrid);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        obstacleGrid = new int[][]{{0,1},{0,0}};
        expected = 1;
        actual = clz.uniquePathsWithObstacles(obstacleGrid);
        assertEquals(expected, actual);
    }
}
