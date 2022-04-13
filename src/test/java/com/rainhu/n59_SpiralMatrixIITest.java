package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class n59_SpiralMatrixIITest {
    
    n59_SpiralMatrixII clz = new n59_SpiralMatrixII();
    int[][] expected, actual;
    int n;

    @Test
    public void test1(){
        n = 3;
        expected = new int[][]{{1,2,3},{8,9,4},{7,6,5}};
        actual = clz.generateMatrix(n);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void test2(){
        n = 1;
        expected = new int[][]{{1}};
        actual = clz.generateMatrix(n);
        assertArrayEquals(expected, actual);
    }
}
