package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n1584_MinCostToConnectAllPointsTest {
    
    n1584_MinCostToConnectAllPoints clz = new n1584_MinCostToConnectAllPoints();
    int[][] points;
    int expected, actual;

    @Test
    public void test1(){
        points = new int[][]{{0,0},{2,2},{3,10},{5,2},{7,0}};
        expected = 20;
        actual = clz.minCostConnectPoints(points);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        points = new int[][]{{3,12},{-2,5},{-4,1}};
        expected = 18;
        actual = clz.minCostConnectPoints(points);
        assertEquals(expected, actual);
    }
}
