package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n43_MultiplyStringsTest {
    
    n43_MultiplyStrings clz = new n43_MultiplyStrings();
    String num1;
    String num2;
    String expected;
    String actual;

    @Test
    public void test1(){
        num1 = "2";
        num2 = "3";
        expected = "6";
        actual = clz.multiply(num1, num2);
        assertEquals(expected, actual);
    }
    
    @Test
    public void test2(){
        num1 = "123";
        num2 = "456";
        expected = "56088";
        actual = clz.multiply(num1, num2);
        assertEquals(expected, actual);
    }
}
