package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class n6_ZigzagConversionTest {
    
    n6_ZigzagConversion clz = new n6_ZigzagConversion();

    String s;
    int numRows;
    String actual, expected;
    
    @Test
    public void test1(){
        s = "PAYPALISHIRING";
        numRows = 3;
        actual = clz.convert(s, numRows);
        expected = "PAHNAPLSIIGYIR";
        assertTrue(expected.equals(actual));
    }
    @Test
    public void test2(){
        s = "PAYPALISHIRING";
        numRows = 4;
        actual = clz.convert(s, numRows);
        expected = "PINALSIGYAHRPI";
        assertTrue(expected.equals(actual));
    }
}
