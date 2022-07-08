package com.rainhu;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.rainhu.util.Snippet;

public class n1473_PaintHouseIIITest {
    
    n1473_PaintHouseIII clz = new n1473_PaintHouseIII();
    int[] houses;
    int[][] cost;
    int m, n, target;
    int expected, actual;

    @Test
    public void test1(){
        houses = Snippet.stringToIntegerArray("[0,0,0,0,0]");
        cost = Snippet.stringToInt2dArray("[[1,10],[10,1],[10,1],[1,10],[5,1]]");
        m = 5; n = 2;
        target = 3;
        expected = 9;
        actual = clz.minCost(houses, cost, m, n, target);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        houses = Snippet.stringToIntegerArray("[0,2,1,2,0]");
        cost = Snippet.stringToInt2dArray("[[1,10],[10,1],[10,1],[1,10],[5,1]]");
        m = 5; n = 2;
        target = 3;
        expected = 11;
        actual = clz.minCost(houses, cost, m, n, target);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        houses = Snippet.stringToIntegerArray("[3,1,2,3]");   
        cost = Snippet.stringToInt2dArray("[[1,1,1],[1,1,1],[1,1,1],[1,1,1]]");
        m = 4; n = 3;
        target = 3;
        expected = -1;
        actual = clz.minCost(houses, cost, m, n, target);
        assertEquals(expected, actual);
    }
}
