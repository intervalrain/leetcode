package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n165_CompareVersionNumbersTest {
    
    n165_CompareVersionNumbers clz = new n165_CompareVersionNumbers();
    String version1, version2;
    int expected, actual;

    @Test
    public void test1(){
        version1 = "1.01";
        version2 = "1.001";
        expected = 0;
        actual = clz.compareVersion(version1, version2);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        version1 = "1.0";
        version2 = "1.0.0";
        expected = 0;
        actual = clz.compareVersion(version1, version2);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        version1 = "0.1";
        version2 = "1.1";
        expected = -1;
        actual = clz.compareVersion(version1, version2);
        assertEquals(expected, actual);
    }
}
