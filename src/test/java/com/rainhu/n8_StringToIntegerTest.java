package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n8_StringToIntegerTest {
 
    n8_StringToInteger clz = new n8_StringToInteger();
    String s;
    int expected, actual;

    @Test
    public void test1(){
        s = "42";
        actual = clz.myAtoi(s);
        expected = 42;
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        s = "     -42";
        actual = clz.myAtoi(s);
        expected = -42;
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        s = "4193 with words";
        actual = clz.myAtoi(s);
        expected = 4193;
        assertEquals(expected, actual);
    }

    @Test
    public void test4(){
        s = "words and 987";
        actual = clz.myAtoi(s);
        expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void test5(){
        s = "-91283472332";
        actual = clz.myAtoi(s);
        expected = -2147483648;
        assertEquals(expected, actual);
    }

    @Test
    public void test6(){
        s = ".1";
        actual = clz.myAtoi(s);
        expected = 0;
        assertEquals(expected, actual);
    }
}

