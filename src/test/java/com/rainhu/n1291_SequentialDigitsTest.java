package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class n1291_SequentialDigitsTest {
    
    n1291_SequentialDigits clz = new n1291_SequentialDigits();
    int low, high;
    List<Integer> expected;
    List<Integer> actual;

    @Test
    public void test1(){
        low = 100;
        high = 300;
        expected = List.of(123, 234);
        actual = clz.sequentialDigits(low, high);
        assertEquals(expected.toString(), actual.toString());
    }

    @Test
    public void test2(){
        low = 1000;
        high = 13000;
        expected = List.of(1234,2345,3456,4567,5678,6789,12345);
        actual = clz.sequentialDigits(low, high);
        assertEquals(expected.toString(), actual.toString());
    }
}
