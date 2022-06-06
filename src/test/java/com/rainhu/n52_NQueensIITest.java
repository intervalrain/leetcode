package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n52_NQueensIITest {
    
    n52_NQueensII clz = new n52_NQueensII();
    int n;
    int expected, actual;

    @Test
    public void test1(){
        int n = 4;
        expected = clz.totalNQueens(n);
        actual = 2;
        assertEquals(expected, actual);
    }
    @Test
    public void test2(){
        int n = 1;
        expected = clz.totalNQueens(n);
        actual = 1;
        assertEquals(expected, actual);
    }
}
