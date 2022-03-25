package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n1029_TwoCitySchedulingTest {

    n1029_TwoCityScheduling clz = new n1029_TwoCityScheduling();
    int[][] costs;
    int expected, actual;

    @Test
    public void test1(){
        costs = new int[][]{{10,20},{30,200},{400,50},{30,20}};
        expected = 110;
        actual = clz.twoCitySchedCost(costs);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        costs = new int[][]{{259,770},{448,54},{926,667},{184,139},{840,118},{577,469}};
        expected = 1859;
        actual = clz.twoCitySchedCost(costs);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        costs = new int[][]{{515,563},{451,713},{537,709},{343,819},{855,779},{457,60},{650,359},{631,42}};
        expected = 3086;
        actual = clz.twoCitySchedCost(costs);
        assertEquals(expected, actual);
    }
}