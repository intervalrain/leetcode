package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n875_KokoEatingBananasTest {
    
    n875_KokoEatingBananas clz = new n875_KokoEatingBananas();
    int minEatingSpeed;
    int[] piles;
    int h;
    int expected;
    int actual;

    @Test
    public void test1(){
        piles = new int[]{3,6,7,11};
        h = 8;
        expected = 4;
        actual = clz.minEatingSpeed(piles, h);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        piles = new int[]{30,11,23,4,20};
        h = 5;
        expected = 30;
        actual = clz.minEatingSpeed(piles, h);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        piles = new int[]{30,11,23,4,20};
        h = 6;
        expected = 23;
        actual = clz.minEatingSpeed(piles, h);
        assertEquals(expected, actual);
    }
}
