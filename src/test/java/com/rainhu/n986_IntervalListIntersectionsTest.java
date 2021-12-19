package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class n986_IntervalListIntersectionsTest {
    
    n986_IntervalListIntersections clz = new n986_IntervalListIntersections();
    int[][] firstList;
    int[][] secondList;
    int[][] expected;
    int[][] actual;

    @Test
    public void test1(){
        firstList = new int[][]{{0,2}, {5,10}, {13,23}, {24,25}};
        secondList = new int[][]{{1,5}, {8,12}, {15,24}, {25,26}};
        expected = new int[][]{{1,2}, {5,5}, {8,10}, {15,23}, {24,24}, {25,25}};
        actual = clz.intervalIntersection(firstList, secondList);
        assertTrue(Equals(expected, actual));
    }

    @Test
    public void test2(){
        firstList = new int[][]{{1,3}, {5,9}};
        secondList = new int[][]{};
        expected = new int[][]{};
        actual = clz.intervalIntersection(firstList, secondList);
        assertTrue(Equals(expected, actual));
    }

    @Test
    public void test3(){
        firstList = new int[][]{};
        secondList = new int[][]{{4,8}, {10,12}};
        expected = new int[][]{};
        actual = clz.intervalIntersection(firstList, secondList);
        assertTrue(Equals(expected, actual));
    }

    @Test
    public void test4(){
        firstList = new int[][]{{1,7}};
        secondList = new int[][]{{3,10}};
        expected = new int[][]{{3,7}};
        actual = clz.intervalIntersection(firstList, secondList);
        assertTrue(Equals(expected, actual));
    }

    public static boolean Equals(int[][] a, int[][] b){
        if (a.length != b.length) return false;
        for (int i=0; i<a.length; i++){
            if (a[i][0] != b[i][0]) return false;
            if (a[i][1] != b[i][1]) return false;
        }
            
        return true;
    }
}
