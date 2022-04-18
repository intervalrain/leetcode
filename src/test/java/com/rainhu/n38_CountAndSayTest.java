package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n38_CountAndSayTest {
 
    n38_CountAndSay clz = new n38_CountAndSay();
    int n;
    String expected, actual;

    @Test
    public void test1(){
        n = 1;
        expected = "1";
        actual = clz.countAndSay(n);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        n = 4;
        expected = "1211";
        actual = clz.countAndSay(n);
        assertEquals(expected, actual);
    }
}
