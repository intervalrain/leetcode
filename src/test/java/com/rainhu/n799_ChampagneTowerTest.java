package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n799_ChampagneTowerTest {
    
    n799_ChampagneTower clz = new n799_ChampagneTower();
    int poured, query_row, query_glass;
    double expected, actual;

    @Test
    public void test1(){
        poured = 1;
        query_row = 1;
        query_glass = 1;
        expected = 0.00000;
        actual = clz.champagneTower(poured, query_row, query_glass);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        poured = 2;
        query_row = 1;
        query_glass = 1;
        expected = 0.50000;
        actual = clz.champagneTower(poured, query_row, query_glass);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        poured = 100000009;
        query_row = 33;
        query_glass = 17;
        expected = 1;
        actual = clz.champagneTower(poured, query_row, query_glass);
        assertEquals(expected, actual);
    }

    @Test
    public void test4(){
        poured = 11;
        query_row = 4;
        query_glass = 2;
        expected = 1.0000;
        actual = clz.champagneTower(poured, query_row, query_glass);
        assertEquals(expected, actual);
    }
}
