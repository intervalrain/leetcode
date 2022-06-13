package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class n120_TriangleTest {
    
    n120_Triangle clz = new n120_Triangle();
    List<List<Integer>> triangle;
    int expected, actual;

    @Test
    public void test1(){
        triangle = Arrays.asList(
                    Arrays.asList(new Integer[]{2}),
                    Arrays.asList(new Integer[]{3,4}),
                    Arrays.asList(new Integer[]{6,5,7}),
                    Arrays.asList(new Integer[]{4,1,8,3}));
        expected = 11;
        actual = clz.minimumTotal(triangle);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        triangle = Arrays.asList(
                    Arrays.asList(new Integer[]{-10}));
        expected = -10;
        actual = clz.minimumTotal(triangle);
        assertEquals(expected, actual);
    }

}
