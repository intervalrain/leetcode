package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class n210_CourseScheduleIITest{

    public n210_CourseScheduleII clz = new n210_CourseScheduleII();
    int numCourses;
    int[][] prerequisites;
    int[] expected;
    int[] actual;

    @Test
    public void test1(){
        numCourses = 2;
        prerequisites = new int[][]{{1,0}};
        expected = new int[]{0,1};
        actual = clz.findOrder(numCourses, prerequisites);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void test2(){
        numCourses = 4;
        prerequisites = new int[][]{{1,0},{2,0},{3,1},{3,2}};
        int[] expected1 = new int[]{0,2,1,3};
        int[] expected2 = new int[]{0,1,2,3};
        actual = clz.findOrder(numCourses, prerequisites);
        assertTrue(Arrays.equals(expected1, actual) || Arrays.equals(expected2, actual));
    }

    @Test
    public void test3(){
        numCourses = 1;
        prerequisites = new int[][]{};
        expected = new int[]{0};
        actual = clz.findOrder(numCourses, prerequisites);
        assertArrayEquals(expected, actual);
    }
}