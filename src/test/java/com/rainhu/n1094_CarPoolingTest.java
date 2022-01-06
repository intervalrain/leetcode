package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n1094_CarPoolingTest {
    
    n1094_CarPooling clz = new n1094_CarPooling();
    int[][] trips;
    int capacity;
    boolean expected;
    boolean actual;

    @Test
    public void test1(){
        trips = new int[][]{{2,1,5},{3,3,7}};
        capacity = 4;
        expected = false;
        actual = clz.carPooling(trips, capacity);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        trips = new int[][]{{2,1,5},{3,3,7}};
        capacity = 5;
        expected = true;
        actual = clz.carPooling(trips, capacity);

    }
}
