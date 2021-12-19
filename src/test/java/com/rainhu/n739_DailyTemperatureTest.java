package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class n739_DailyTemperatureTest {
    
    n739_DailyTemperature clz = new n739_DailyTemperature();
    int[] temp;
    int[] actual;
    int[] expected;

    @Test
    public void test1(){
        temp = new int[]{73,74,75,71,69,72,76,73};
        expected = new int[]{1,1,4,2,1,1,0,0};
        actual = clz.dailyTemperature(temp);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void test2(){
        temp = new int[]{30,40,50,60};
        expected = new int[]{1,1,1,0};
        actual = clz.dailyTemperature(temp);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void test3(){
        temp = new int[]{30,60,90};
        expected = new int[]{1,1,0};
        actual = clz.dailyTemperature(temp);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void test4(){
        temp = new int[]{55,38,53,81,61,93,97,32,43,78};
        expected = new int[]{3,1,1,2,1,1,0,1,1,0};
        actual = clz.dailyTemperature(temp);
        assertArrayEquals(expected, actual);
    }
}