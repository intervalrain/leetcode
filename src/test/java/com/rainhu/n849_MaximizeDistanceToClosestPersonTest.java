package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n849_MaximizeDistanceToClosestPersonTest{
    
    n849_MaximizeDistanceToClosestPerson clz = new n849_MaximizeDistanceToClosestPerson();
    int[] seats;
    int expected;
    int actual;

    @Test
    public void test1(){
        seats = new int[]{1,0,0,0,1,0,1};
        expected = 2;
        actual = clz.maxDistToClosest(seats);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        seats = new int[]{1,0,0,0};
        expected = 3;
        actual = clz.maxDistToClosest(seats);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        seats = new int[]{0,1};
        expected = 1;
        actual = clz.maxDistToClosest(seats);
        assertEquals(expected, actual);
    }
}