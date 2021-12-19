package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class n118_PascalsTriangleTest {
    
    n118_PascalsTriangle clz = new n118_PascalsTriangle();
    int numRows;
    List<List<Integer>> expected;
    List<List<Integer>> actual;

    @Test
    public void test1(){
        numRows = 5;
        expected = new ArrayList<>(List.of(List.of(1), List.of(1,1), List.of(1,2,1), List.of(1,3,3,1), List.of(1,4,6,4,1)));
        actual = clz.generate(numRows);
        assertTrue(expected.size() == actual.size());
        for (int i=0; i<expected.size(); i++)
            assertArrayEquals(actual.get(i).toArray(), expected.get(i).toArray());
    }

    @Test
    public void test2(){
        numRows = 1;
        expected = new ArrayList<>(List.of(List.of(1)));
        actual = clz.generate(numRows);
        assertTrue(expected.size() == actual.size());
        for (int i=0; i<expected.size(); i++)
            assertArrayEquals(actual.get(i).toArray(), expected.get(i).toArray());
    }
}
