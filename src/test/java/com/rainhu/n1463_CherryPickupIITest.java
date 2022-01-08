package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n1463_CherryPickupIITest {
    
    n1463_CherryPickupII clz = new n1463_CherryPickupII();
    int[][] grid;
    int expected;
    int actual;

    @Test
    public void test1(){
        grid = new int[][]{{3,1,1},{2,5,1},{1,5,5},{2,1,1}};
        expected = 24;
        actual = clz.cherryPickup(grid);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        grid = new int[][]{{1,0,0,0,0,0,1},{2,0,0,0,0,3,0},{2,0,9,0,0,0,0},{0,3,0,5,4,0,0},{1,0,2,3,0,0,6}};
        expected = 28;
        actual = clz.cherryPickup(grid);
        assertEquals(expected, actual);
    }
}
