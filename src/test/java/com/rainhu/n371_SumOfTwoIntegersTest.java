package com.rainhu;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class n371_SumOfTwoIntegersTest {
    n371_SumOfTwoIntegers clz = new n371_SumOfTwoIntegers();
    int a, b;
    int expected, actual;

    @Test
    public void test1(){
        a = 1;
        b = 2;
        expected = 3;
        actual = clz.getSum(a, b);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        a = 2;
        b = 3;
        expected = 5;
        actual = clz.getSum(a, b);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        a = -3;
        b = 2;
        expected = -1;
        actual = clz.getSum(a, b);
        assertEquals(expected, actual);
    }
    @Test
    public void test4(){
        a = 4;
        b = 5;
        expected = 9;
        actual = clz.getSum(a, b);
        assertEquals(expected, actual);
    }
    @Test
    public void test5(){
        a = -1;
        b = 1;
        expected = 0;
        actual = clz.getSum(a, b);
        assertEquals(expected, actual);
    }
}
