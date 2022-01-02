package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n1010_PairsOfSongsWithTotalDurationsDivisibleBy60Test {

    n1010_PairsOfSongsWithTotalDurationsDivisibleBy60 clz = new n1010_PairsOfSongsWithTotalDurationsDivisibleBy60();
    int[] time;
    int expected;
    int actual;

    @Test
    public void test1(){
        time = new int []{30,20,150,100,40};
        expected = 3;
        actual = clz.numPairsDivisibleBy60(time);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        time = new int[]{60,60,60};
        expected = 3;
        actual = clz.numPairsDivisibleBy60(time);
        assertEquals(expected, actual);
    }
}
