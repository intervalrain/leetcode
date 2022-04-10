package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n682_BaseballGameTest {

    n682_BaseballGame clz = new n682_BaseballGame();
    String[] ops;
    int expected, actual;

    @Test
    public void test1(){
        ops = new String[]{"5", "2", "C", "D", "+"};
        expected = 30;
        actual = clz.calPoints(ops);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        ops = new String[]{"5", "-2", "4", "C", "D", "9", "+", "+"};
        expected = 27;
        actual = clz.calPoints(ops);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        ops = new String[]{"1"};
        expected = 1;
        actual = clz.calPoints(ops);
        assertEquals(expected, actual);
    }
}
