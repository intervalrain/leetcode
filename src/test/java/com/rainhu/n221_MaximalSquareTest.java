package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n221_MaximalSquareTest {
    
    n221_MaximalSquare clz = new n221_MaximalSquare();
    char[][] matrix;
    int expected;
    int actual;

    @Test
    public void test1(){
        matrix = new char[][]{{'1','0','1','0','0'},
                              {'1','0','1','1','1'},
                              {'1','1','1','1','1'},
                              {'1','0','0','1','0'}};
        expected = 4;
        actual = clz.maximalSquare(matrix);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        matrix = new char[][]{{'0','1'},
                              {'1','0'}};
        expected = 1;
        actual = clz.maximalSquare(matrix);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        matrix = new char[][]{{'0'}};
        expected = 0;
        actual = clz.maximalSquare(matrix);
        assertEquals(expected, actual);
    }
}
