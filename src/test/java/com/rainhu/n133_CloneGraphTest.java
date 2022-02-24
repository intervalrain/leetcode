package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.rainhu.DioUtility.UndirectedGraphNode;

import org.junit.jupiter.api.Test;

public class n133_CloneGraphTest {
    
    n133_CloneGraph clz = new n133_CloneGraph();
    int[][] adjList;
    UndirectedGraphNode expected, actual;

    @Test
    public void test1(){
        adjList = new int[][]{{2,4},{1,3},{2,4},{1,3}};
        expected = new UndirectedGraphNode(adjList);
        actual = clz.cloneGraph(expected);
        assertTrue(expected.equals(actual));
    }

    @Test
    public void test2(){
        adjList = new int[][]{{}};
        expected = null;
        actual = clz.cloneGraph(expected);
        assertNull(actual);
    }

}
