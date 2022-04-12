package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class n289_GameOfLifeTest {
    
    n289_GameOfLife clz = new n289_GameOfLife();
    int[][] actual;
    int[][] expected;

    @Test
    public void test1(){
        actual   = new int[][]{ {0,1,0},
                                {0,0,1},
                                {1,1,1},
                                {0,0,0}};
        expected = new int[][]{ {0,0,0},
                                {1,0,1},
                                {0,1,1},
                                {0,1,0}};
        clz.gameOfLife(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void test2(){
        actual   = new int[][]{ {1,1},
                                {1,0}};
        expected = new int[][]{ {1,1},
                                {1,1}};
        clz.gameOfLife(actual);
        assertArrayEquals(expected, actual);
    }

}
