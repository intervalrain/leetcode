package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n74_SearchA2DMatrixTest {
    
    n74_SearchA2DMatrix clz = new n74_SearchA2DMatrix();
    int[][] matrix;
    int target;
    boolean expected, actual;

    @Test
    public void test1(){
        matrix = new int[][]{{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        target = 3;
        expected = true;
        actual = clz.searchMatrix(matrix, target);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        matrix = new int[][]{{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        target = 13;
        expected = false;
        actual = clz.searchMatrix(matrix, target);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        matrix = new int[][]{{1}};
        target = 1;
        expected = true;
        actual = clz.searchMatrix(matrix, target);
        assertEquals(expected, actual);
    }

    @Test
    public void test4(){
        matrix = new int[][]{{1,3}};
        target = 3;
        expected = true;
        actual = clz.searchMatrix(matrix, target);
        assertEquals(expected, actual);
    }
}
