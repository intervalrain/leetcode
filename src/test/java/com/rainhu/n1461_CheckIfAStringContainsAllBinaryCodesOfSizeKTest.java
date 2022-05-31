package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n1461_CheckIfAStringContainsAllBinaryCodesOfSizeKTest {
    
    n1461_CheckIfAStringContainsAllBinaryCodesOfSizeK clz = new n1461_CheckIfAStringContainsAllBinaryCodesOfSizeK();
    String s;
    int k;
    boolean expected, actual;

    @Test
    public void test1(){
        s = "00110110";
        k = 2;
        expected = true;
        actual = clz.hasAllCodes(s, k);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        s = "0110";
        k = 1;
        expected = true;
        actual = clz.hasAllCodes(s, k);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        s = "0110";
        k = 2;
        expected = false;
        actual = clz.hasAllCodes(s, k);
        assertEquals(expected, actual);
    }

    @Test
    public void test4(){
        s = "00110";
        k = 2;
        expected = true;
        actual = clz.hasAllCodes(s, k);
        assertEquals(expected, actual);
    }

    @Test
    public void test5(){
        s = "0001011100";
        k = 3;
        expected = true;
        actual = clz.hasAllCodes(s, k);
        assertEquals(expected, actual);
    }
}
