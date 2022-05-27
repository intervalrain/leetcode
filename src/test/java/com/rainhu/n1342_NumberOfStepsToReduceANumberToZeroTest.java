package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n1342_NumberOfStepsToReduceANumberToZeroTest {
    
    n1342_NumberOfStepsToReduceANumberToZero clz = new n1342_NumberOfStepsToReduceANumberToZero();
    int num;
    int expected, actual;

    @Test
    public void test1(){
        num = 14;
        expected = 6;
        actual = clz.numberOfSteps(num);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        num = 8;
        expected = 4;
        actual = clz.numberOfSteps(num);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        num = 123;
        expected = 12;
        actual = clz.numberOfSteps(num);
        assertEquals(expected, actual);
    }
}
