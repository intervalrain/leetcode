package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.Comparator;

import org.junit.jupiter.api.Test;

public class n973_KClosestPointsToOriginTest{

    n973_KClosestPointsToOrigin clz = new n973_KClosestPointsToOrigin();
    int[][] points;
    int k;
    int[][] expected;
    int[][] actual;

    @Test
    public void test1(){
        points = new int[][]{{1,3},{-2,2}};
        k = 1;
        expected = new int[][]{{-2,2}};
        actual = clz.KClosest(points, k);
        assertTrue(expected.length == actual.length);
        for (int i = 0; i < expected.length; i++)
            assertArrayEquals(expected[i], actual[i]);
    }

    @Test
    public void test2(){
        points = new int[][]{{3,3},{5,-1},{-2,4}};
        k = 2;
        expected = new int[][]{{-2,4},{3,3}};
        actual = clz.KClosest(points, k);
        sort(actual);
        assertTrue(expected.length == actual.length);
        for (int i = 0; i < expected.length; i++)
            assertArrayEquals(expected[i], actual[i]);
    }

    public void sort(int[][] arr){
        Arrays.sort(arr, new Comparator<int[]>() {
            public int compare(int[] o1, int[] o2){
                if (o1[0] == o2[0]) return o1[1] > o2[1] ? 1 : -1;
                return o1[0] > o2[0] ? 1 : -1;
            }
        });
        
        for (int i = 0; i < arr.length; i++)
            System.out.println(Arrays.toString(arr[i]));
    }
}