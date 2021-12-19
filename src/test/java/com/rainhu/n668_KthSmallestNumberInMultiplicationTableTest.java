package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n668_KthSmallestNumberInMultiplicationTableTest {

    n668_KthSmallestNumberInMultiplicationTable clz = new n668_KthSmallestNumberInMultiplicationTable();
    int m;
    int n;
    int k;
    int expected;
    int actual;

    @Test
    public void test1(){
        m = 3; n = 3; k = 5;
        expected = 3;
        actual = clz.findKthNumber(m, n, k);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        m = 2; n = 3; k = 6;
        expected = 6;
        actual = clz.findKthNumber(m, n, k);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        m = 4; n = 5; k = 12;
        expected = 8;
        actual = clz.findKthNumber(m, n, k);
        assertEquals(expected, actual);
    }

    @Test
    public void test4(){
        m = 20; n = 21; k = 271;
        expected = 132;
        actual = clz.findKthNumber(m, n, k);
        assertEquals(expected, actual);
    }

    @Test
    public void test5(){
        m = 11; n = 13; k = 57;
        expected = 24;
        actual = clz.findKthNumber(m, n, k);
        assertEquals(expected, actual);
    }

    @Test
    public void test_helper(){
        m = 11; n = 13;
        assertEquals(117, clz.helper(72, m, n));
        assertEquals(117, clz.helper(73, m, n));
        assertEquals(117, clz.helper(75, m, n));
        assertEquals(119, clz.helper(77, m, n));
        assertEquals(120, clz.helper(78, m, n));
        assertEquals(122, clz.helper(80, m, n));
        assertEquals(123, clz.helper(81, m, n));
        assertEquals(124, clz.helper(84, m, n));
        assertEquals(126, clz.helper(88, m, n));
        assertEquals(128, clz.helper(90, m, n));
        assertEquals(129, clz.helper(91, m, n));
        assertEquals(130, clz.helper(96, m, n));
        assertEquals(132, clz.helper(99, m, n));
    }
}
