package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n1689_PartitioningIntoMinimumNumberOfDeciBinaryNumbersTest {
    
    n1689_PartitioningIntoMinimumNumberOfDeciBinaryNumbers clz = new n1689_PartitioningIntoMinimumNumberOfDeciBinaryNumbers();
    String n;
    int expected, actual;

    @Test
    public void test1(){
        n = "32";
        expected = 3;
        actual = clz.minPartitions(n);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        n = "82734";
        expected = 8;
        actual = clz.minPartitions(n);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        n = "27346209830709182346";
        expected = 9;
        actual = clz.minPartitions(n);
        assertEquals(expected, actual);
    }
}
