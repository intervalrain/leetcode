package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n1009_ComplementOfBase10IntegerTest {
    
    n1009_ComplementOfBase10Integer clz = new n1009_ComplementOfBase10Integer();
    int n;
    int expected;
    int actual;

    @Test
    public void test1(){
        n = 5;
        expected = 2;
        actual = clz.bitwiseComplement(n);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        n = 7;
        expected = 0;
        actual = clz.bitwiseComplement(n);
        assertEquals(expected, actual);        
    }
    
    @Test
    public void test3(){
        n = 10;
        expected = 5;
        actual = clz.bitwiseComplement(n);
        assertEquals(expected, actual);
    }
}
