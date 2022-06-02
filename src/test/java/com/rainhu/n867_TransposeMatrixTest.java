package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class n867_TransposeMatrixTest {
    
    n867_TransposeMatrix clz = new n867_TransposeMatrix();
    int[][] matrix;
    int[][] expected, actual;

    @Test
    public void test1(){
        matrix = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        expected = new int[][]{{1,4,7},{2,5,8},{3,6,9}};
        actual = clz.transpose(matrix);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void test2(){
        matrix = new int[][]{{1,2,3},{4,5,6}};
        expected = new int[][]{{1,4},{2,5},{3,6}};
        actual = clz.transpose(matrix);
        assertArrayEquals(expected, actual);
    }
}
