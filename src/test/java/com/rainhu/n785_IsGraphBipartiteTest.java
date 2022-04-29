package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n785_IsGraphBipartiteTest {
    
    n785_IsGraphBipartite clz = new n785_IsGraphBipartite();
    int[][] graph;
    boolean expected, actual;

    @Test
    public void test1(){
        graph = new int[][]{{1,2,3},{0,2},{0,1,3},{0,2}};
        expected = false;
        actual = clz.isBipartite(graph);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        graph = new int[][]{{1,3},{0,2},{1,3},{0,2}};
        expected = true;
        actual = clz.isBipartite(graph);
        assertEquals(expected, actual);
    }
}
