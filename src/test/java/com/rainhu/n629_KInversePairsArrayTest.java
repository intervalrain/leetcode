package com.rainhu;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class n629_KInversePairsArrayTest {
    
    n629_KInversePairsArray clz = new n629_KInversePairsArray();
    int n, k;
    int expected, actual;

    @Test
    public void test1(){
        n = 3;
        k = 0;
        expected = 1;
        actual = clz.kInversePairs(n, k);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        n = 3;
        k = 1;
        expected = 2;
        actual = clz.kInversePairs(n, k);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        n = 5;
        k = 5;
        expected = 22;
        actual = clz.kInversePairs(n, k);
        assertEquals(expected, actual);
    }

    @Test
    public void test4(){
        n = 10;
        k = 6;
        expected = 2298;
        actual = clz.kInversePairs(n, k);
        assertEquals(expected, actual);
    }
}
