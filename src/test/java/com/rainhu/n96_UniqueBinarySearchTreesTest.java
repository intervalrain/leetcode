package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n96_UniqueBinarySearchTreesTest {
    
    n96_UniqueBinarySearchTrees clz = new n96_UniqueBinarySearchTrees();

    int n;
    int expected;
    int actual;

    @Test
    public void test1(){
        n = 3;
        expected = 5;
        actual = clz.numTrees(n);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        n = 1;
        expected = 1;
        actual = clz.numTrees(n);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        n = 4;
        expected = 14;
        actual = clz.numTrees(n);
        assertEquals(expected, actual);
    }

    @Test
    public void test4(){
        n = 5;
        expected = 42;
        actual = clz.numTrees(n);
        assertEquals(expected, actual);
    }

    @Test
    public void test5(){
        n = 6;
        expected = 132;
        actual = clz.numTrees(n);
        assertEquals(expected, actual);
    }

    @Test
    public void test6(){
        n = 7;
        expected = 429;
        actual = clz.numTrees(n);
        assertEquals(expected, actual);
    }
}
