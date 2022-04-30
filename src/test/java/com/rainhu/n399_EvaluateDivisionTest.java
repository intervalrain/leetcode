package com.rainhu;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class n399_EvaluateDivisionTest {
    
    n399_EvaluateDivision clz = new n399_EvaluateDivision();
    List<List<String>> equations;
    double[] values;
    List<List<String>> queries;
    double[] expected, actual;

    @Test
    public void test1(){
        equations = Arrays.asList(Arrays.asList("a","b"),Arrays.asList("b","c"));
        values = new double[]{2.0, 3.0};
        queries = Arrays.asList(Arrays.asList("a","c"),Arrays.asList("b","a"),Arrays.asList("a","e"),Arrays.asList("a","a"),Arrays.asList("x","x"));
        expected = new double[]{6.0, 0.5, -1.0, 1.0, -1.0};
        actual = clz.calcEquation(equations, values, queries);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void test2(){
        equations = Arrays.asList(Arrays.asList("a","b"),Arrays.asList("b","c"),Arrays.asList("bc","cd"));
        values = new double[]{1.5,2.5,5.0};
        queries = Arrays.asList(Arrays.asList("a","c"),Arrays.asList("c","b"),Arrays.asList("bc","cd"),Arrays.asList("cd","bc"));
        expected = new double[]{3.75, 0.4, 5.0, 0.2};
        actual = clz.calcEquation(equations, values, queries);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void test3(){
        equations = Arrays.asList(Arrays.asList("a","b"));
        values = new double[]{0.5};
        queries = Arrays.asList(Arrays.asList("a","b"),Arrays.asList("b","a"),Arrays.asList("a","c"),Arrays.asList("x","y"));
        expected = new double[]{0.5, 2.0, -1.0, -1.0};
        actual = clz.calcEquation(equations, values, queries);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void test4(){
        equations = Arrays.asList(Arrays.asList("x1","x2"),Arrays.asList("x2","x3"),Arrays.asList("x3","x4"),Arrays.asList("x4","x5"));
        values = new double[]{3.0,4.0,5.0,6.0};
        queries = Arrays.asList(Arrays.asList("x1","x5"),Arrays.asList("x5","x2"),Arrays.asList("x2","x4"),Arrays.asList("x2","x2"),Arrays.asList("x9","x9"));
        expected = new double[]{360.0, 1.0/120.0, 20.0, 1.0, -1.0};
        actual = clz.calcEquation(equations, values, queries);
        assertArrayEquals(expected, actual);
    }
}
