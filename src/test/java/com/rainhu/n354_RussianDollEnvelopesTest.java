package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n354_RussianDollEnvelopesTest {
    
    n354_RussianDollEnvelopes clz = new n354_RussianDollEnvelopes();
    int[][] envelopes;
    int expected, actual;

    @Test
    public void test1(){
        envelopes = new int[][]{{5,4},{6,4},{6,7},{2,3}};
        expected = 3;
        actual = clz.maxEnvelopes(envelopes);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        envelopes = new int[][]{{1,1},{1,1},{1,1}};
        expected = 1;
        actual = clz.maxEnvelopes(envelopes);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        envelopes = new int[][]{{10,8},{1,12},{6,15},{2,18}};
        expected = 2;
        actual = clz.maxEnvelopes(envelopes);
        assertEquals(expected, actual);
    }

    @Test
    public void test4(){
        envelopes = new int[][]{{1,1},{1,5},{2,3},{3,2},{3,4},{5,3},{5,5}};
        expected = 4;
        actual = clz.maxEnvelopes(envelopes);
        assertEquals(expected, actual);
    }
}
