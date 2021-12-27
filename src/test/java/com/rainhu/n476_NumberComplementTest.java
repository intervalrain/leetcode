package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n476_NumberComplementTest{
    
    n476_NumberComplement clz = new n476_NumberComplement();
    int num;
    int expected;
    int actual;

    @Test
    public void test1(){
        num = 5;
        expected = 2;
        actual = clz.findComplement(num);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        num = 1;
        expected = 0;
        actual = clz.findComplement(num);
        assertEquals(expected, actual);
    }
    
}