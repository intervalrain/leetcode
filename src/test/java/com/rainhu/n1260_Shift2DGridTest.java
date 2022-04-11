package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class n1260_Shift2DGridTest {
    
    n1260_Shift2DGrid clz = new n1260_Shift2DGrid();
    int[][] grid;
    int k;
    List<List<Integer>> expected, actual;

    @Test
    public void test1(){
        grid = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        k = 1;
        expected = Arrays.asList(Arrays.asList(9,1,2), Arrays.asList(3,4,5), Arrays.asList(6,7,8));
        actual = clz.shiftGrid(grid, k);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        grid = new int[][]{{3,8,1,9},{19,7,2,5},{4,6,11,10},{12,0,21,13}};
        k = 4;
        expected = Arrays.asList(Arrays.asList(12,0,21,13),Arrays.asList(3,8,1,9),Arrays.asList(19,7,2,5),Arrays.asList(4,6,11,10));
        actual = clz.shiftGrid(grid, k);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        grid = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        k = 9;
        expected = Arrays.asList(Arrays.asList(1,2,3), Arrays.asList(4,5,6), Arrays.asList(7,8,9));
        actual = clz.shiftGrid(grid, k);
        assertEquals(expected, actual);
    }
}
