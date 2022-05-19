package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n743_NetworkDelayTimeTest {
    
    n743_NetworkDelayTime clz = new n743_NetworkDelayTime();
    int[][] times;
    int n, k;
    int expected, actual;
    
    @Test
    public void test1(){
        times = new int[][]{{2,1,1},{2,3,1},{3,4,1}};
        n = 4;
        k = 2;
        expected = 2;
        actual = clz.networkDelayTime(times, n, k);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        times = new int[][]{{1,2,1}};
        n = 2;
        k = 1;
        expected = 1;
        actual = clz.networkDelayTime(times, n, k);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        times = new int[][]{{1,2,1}};
        n = 2;
        k = 2;
        expected = -1;
        actual = clz.networkDelayTime(times, n, k);
        assertEquals(expected, actual);
    }
}
