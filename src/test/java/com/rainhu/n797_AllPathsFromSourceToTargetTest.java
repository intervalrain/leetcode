package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

public class n797_AllPathsFromSourceToTargetTest {
    
    n797_AllPathsFromSourceToTarget clz = new n797_AllPathsFromSourceToTarget();
    int[][] graph;
    List<List<Integer>> expected;
    List<List<Integer>> actual;

    @Test
    public void test1(){
        graph = new int[][]{{1,2}, {3}, {3}, {}};
        expected = List.of(List.of(0,1,3), List.of(0,2,3));
        actual = clz.allPathsSourceTarget(graph);
        assertTrue(equals(expected, actual));
    }

    @Test
    public void test2(){
        graph = new int[][]{{4,3,1}, {3,2,4}, {3}, {4}, {}};
        expected = List.of(List.of(0,4), List.of(0,3,4), List.of(0,1,3,4), List.of(0,1,2,3,4), List.of(0,1,4));
        actual = clz.allPathsSourceTarget(graph);
        assertTrue(equals(expected, actual));
    }

    @Test
    public void test3(){
        graph = new int[][]{{1}, {}};
        expected = List.of(List.of(0,1));
        actual = clz.allPathsSourceTarget(graph);
        assertTrue(equals(expected, actual));
    }

    @Test
    public void test4(){
        graph = new int[][]{{1,2,3}, {2}, {3}, {}};
        expected = List.of(List.of(0,1,2,3), List.of(0,2,3), List.of(0,3));
        actual = clz.allPathsSourceTarget(graph);
        assertTrue(equals(expected, actual));
    }

    @Test
    public void test5(){
        graph = new int[][]{{1,3}, {2}, {3}, {}};
        expected = List.of(List.of(0,1,2,3), List.of(0,3));
        actual = clz.allPathsSourceTarget(graph);
        assertTrue(equals(expected, actual));
    }

    public boolean equals(List<List<Integer>> a, List<List<Integer>> b){
        if (a == null && b == null) return false;
        if ((a == null && b != null) || (a != null && b == null) || a.size() != b.size()) return false;
        ArrayList<String> c = new ArrayList<>();
        ArrayList<String> d = new ArrayList<>();
        for (int i = 0; i < a.size(); i++){
            c.add(a.get(i).toString());
            d.add(b.get(i).toString());
        }
        c = new ArrayList<String>(c);
        d = new ArrayList<String>(d);

        Collections.sort(c);
        Collections.sort(d);        
        
        return c.equals(d);
    }
}
