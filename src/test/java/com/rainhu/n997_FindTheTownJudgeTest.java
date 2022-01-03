package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n997_FindTheTownJudgeTest{

    n997_FindTheTownJudge clz = new n997_FindTheTownJudge();
    int n;
    int[][] trust;
    int expected;
    int actual;

    @Test
    public void test1(){
        n = 2;
        trust = new int[][]{{1,2}};
        expected = 2;
        actual = clz.findJudge(n, trust);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        n = 3;
        trust = new int[][]{{1,3}, {2,3}};
        expected = 3;
        actual = clz.findJudge(n, trust);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        n = 3;
        trust = new int[][]{{1,3},{2,3},{3,1}};
        expected = -1;
        actual = clz.findJudge(n, trust);
        assertEquals(expected, actual);
    }

    @Test
    public void test4(){
        n = 1;
        trust = new int[][]{};
        expected = 1;
        actual = clz.findJudge(n, trust);
        assertEquals(expected, actual);
    }

    @Test
    public void test5(){
        n = 4;
        trust = new int[][]{{1,2}, {1,3}, {2,1}, {2,3}, {1,4}, {4,3}, {4,1}};
        expected = 3;
        actual = clz.findJudge(n, trust);
        assertEquals(expected, actual);
    }

}