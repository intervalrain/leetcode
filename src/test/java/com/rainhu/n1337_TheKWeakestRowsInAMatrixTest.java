package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class n1337_TheKWeakestRowsInAMatrixTest {
    
    n1337_TheKWeakestRowsInAMatrix clz = new n1337_TheKWeakestRowsInAMatrix();
    int[][] mat;
    int k;
    int[] expected, actual;
    
    @Test
    public void test1(){
        mat = new int[][]{{1,1,0,0,0},
                          {1,1,1,1,0},
                          {1,0,0,0,0},
                          {1,1,0,0,0},
                          {1,1,1,1,1}};
        k = 3;
        expected = new int[]{2,0,3};
        actual = clz.kWeakestRows(mat, k);
        assertArrayEquals(expected, actual);
    }
        
    @Test
    public void test2(){
        mat = new int[][]{{1,0,0,0},
                          {1,1,1,1},
                          {1,0,0,0},
                          {1,0,0,0}};
        k = 2;
        expected = new int[]{0,2};
        actual = clz.kWeakestRows(mat, k);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void test3(){
        mat = new int[][]{{1,1,1,1,1},
                          {1,0,0,0,0},
                          {1,1,0,0,0},
                          {1,1,1,1,0},
                          {1,1,1,1,1}};
        k = 3;
        expected = new int[]{1,2,3};
        actual = clz.kWeakestRows(mat, k);
        assertArrayEquals(expected, actual);
    }
}
