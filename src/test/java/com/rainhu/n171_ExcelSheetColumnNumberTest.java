package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n171_ExcelSheetColumnNumberTest {
    
    n171_ExcelSheetColumnNumber clz = new n171_ExcelSheetColumnNumber();
    String columnTitle;
    int expected, actual;

    @Test
    public void test1(){
        columnTitle = "A";
        expected = 1;
        actual = clz.titleToNumber(columnTitle);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        columnTitle = "AB";
        expected = 28;
        actual = clz.titleToNumber(columnTitle);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        columnTitle = "ZY";
        expected = 701;
        actual = clz.titleToNumber(columnTitle);
        assertEquals(expected, actual);
    }
}
