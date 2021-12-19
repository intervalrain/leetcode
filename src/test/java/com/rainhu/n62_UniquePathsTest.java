package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n62_UniquePathsTest {
    
    n62_UniquePaths clz = new n62_UniquePaths();
    int m;
    int n;
    int expected;
    int actual;

    @Test
    public void test1(){
        m = 3;
        n = 7;
        expected = 28;
        actual = clz.uniquePaths(m, n);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        m = 3;
        n = 2;
        expected = 3;
        actual = clz.uniquePaths(m, n);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        m = 7;
        n = 3;
        expected = 28;
        actual = clz.uniquePaths(m, n);
        assertEquals(expected, actual);
    }

    @Test
    public void test4(){
        m = 3;
        n = 3;
        expected = 6;
        actual = clz.uniquePaths(m, n);
        assertEquals(expected, actual);
    }

}
