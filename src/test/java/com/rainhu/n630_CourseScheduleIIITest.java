package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n630_CourseScheduleIIITest {
    
    n630_CourseScheduleIII clz = new n630_CourseScheduleIII();
    int[][] courses;
    int expected, actual;

    @Test
    public void test1(){
        courses = new int[][]{{100,200},{200,1300},{1000,1250},{2000,3000}};
        expected = 3;
        actual = clz.scheduleCourse(courses);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        courses = new int[][]{{1,2}};
        expected = 1;
        actual = clz.scheduleCourse(courses);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        courses = new int[][]{{3,2},{4,3}};
        expected = 0;
        actual = clz.scheduleCourse(courses);
        assertEquals(expected, actual);
    }
}
