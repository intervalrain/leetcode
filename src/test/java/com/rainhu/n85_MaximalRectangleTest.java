package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n85_MaximalRectangleTest {
 
    n85_MaximalRectangle clz = new n85_MaximalRectangle();
    char[][] matrix;
    int expected;
    int actual;

    @Test
    public void test1(){
        matrix = new char[][]{{'1','0','1','0','0'},
                              {'1','0','1','1','1'},
                              {'1','1','1','1','1'},
                              {'1','0','0','1','0'}};
        expected = 6;
        actual = clz.maximalRectangle(matrix);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        matrix = new char[][]{{}};
        expected = 0;
        actual = clz.maximalRectangle(matrix);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        matrix = new char[][]{{'0'}};
        expected = 0;
        actual = clz.maximalRectangle(matrix);
        assertEquals(expected, actual);
    }

    @Test
    public void test4(){
        matrix = new char[][]{{'1'}};
        expected = 1;
        actual = clz.maximalRectangle(matrix);
        assertEquals(expected, actual);
    }
}
