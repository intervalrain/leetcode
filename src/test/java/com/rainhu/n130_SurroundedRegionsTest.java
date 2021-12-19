package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class n130_SurroundedRegionsTest {
    
    n130_SurroundedRegions clz = new n130_SurroundedRegions();
    char[][] board;
    char[][] expected;

    @Test
    public void test1(){
        board    = new char[][]{{'X','X','X','X'},
                                {'X','O','O','X'},
                                {'X','X','O','X'},
                                {'X','O','X','X'}};

        expected = new char[][]{{'X','X','X','X'},
                                {'X','X','X','X'},
                                {'X','X','X','X'},
                                {'X','O','X','X'}};
        clz.solve(board);
        assertArrayEquals(expected, board);
    }
    @Test
    public void test2(){
        board    = new char[][]{{'X','X','X','X'},
                                {'X','O','X','O'},
                                {'O','X','O','X'},
                                {'X','O','X','X'}};

        expected = new char[][]{{'X','X','X','X'},
                                {'X','X','X','O'},
                                {'O','X','X','X'},
                                {'X','O','X','X'}};
        clz.solve(board);
        assertArrayEquals(expected, board);
    }
    @Test
    public void test3(){
        board    = new char[][]{{'X'}};
        expected = new char[][]{{'X'}};
        clz.solve(board);
        assertArrayEquals(expected, board);
    }
}
