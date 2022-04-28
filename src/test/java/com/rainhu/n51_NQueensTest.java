package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class n51_NQueensTest {
    
    n51_NQueens clz = new n51_NQueens();
    int n;
    List<List<String>> expected, actual;

    @Test
    public void test1(){
        n = 4;
        expected = Arrays.asList(Arrays.asList(".Q..","...Q","Q...","..Q."),Arrays.asList("..Q.","Q...","...Q",".Q.."));
        actual = clz.solveNQueens(n);
        assertEquals(expected, actual);
    }
    @Test
    public void test2(){
        n = 1;
        expected = Arrays.asList(Arrays.asList("Q"));
        actual = clz.solveNQueens(n);
        assertEquals(expected, actual);
    }
}
