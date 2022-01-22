package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n1510_StoneGameIVTest {
 
    n1510_StoneGameIV clz = new n1510_StoneGameIV();
    int n;
    boolean expected;
    boolean actual;

    @Test
    public void test1(){
        n = 1;
        expected = true;
        actual = clz.winnerSquareGame(n);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        n = 2;
        expected = false;
        actual = clz.winnerSquareGame(n);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        n = 4;
        expected = true;
        actual = clz.winnerSquareGame(n);
        assertEquals(expected, actual);
    }

    @Test
    public void test4(){
        n = 7;
        expected = false;
        actual = clz.winnerSquareGame(n);
        assertEquals(expected, actual);
    }
}
