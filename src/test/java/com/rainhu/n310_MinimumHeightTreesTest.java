package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

public class n310_MinimumHeightTreesTest {
    
    n310_MinimumHeightTrees clz = new n310_MinimumHeightTrees();
    int n;
    int[][] edges;
    List<Integer> expected;
    List<Integer> actual;

    @Test
    public void test1(){
        n = 4;
        edges = new int[][]{{1,0},{1,2},{1,3}};
        expected = List.of(1);
        actual = clz.findMinHeightTrees(n, edges);
        assertTrue(expected.equals(actual));
    }

    @Test
    public void test2(){
        n = 1;
        edges = new int[][]{{}};
        expected = List.of(0);
        actual = clz.findMinHeightTrees(n, edges);
        assertTrue(expected.equals(actual));
    }

    @Test
    public void test3(){
        n = 2;
        edges = new int[][]{{0,1}};
        expected = List.of(0,1);
        actual = clz.findMinHeightTrees(n, edges);
        assertTrue(expected.equals(actual));
    }

    @Test
    public void test4(){
        n = 6;
        edges = new int[][]{{3,0},{3,1},{3,2},{3,4},{5,4}};
        expected = List.of(3,4);
        actual = clz.findMinHeightTrees(n, edges);
        assertTrue(expected.equals(actual));
    }
}
