package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n1416_ConsecutiveCharactersTest {

    n1416_ConsecutiveCharacters clz = new n1416_ConsecutiveCharacters();
    String s;
    int expected;
    int actual;

    @Test
    public void test1(){
        s = "leetcode";
        expected = 2;
        actual = clz.maxPower(s);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        s = "abbcccddddeeeeecba";
        expected = 5;
        actual = clz.maxPower(s);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        s = "triplepillooooow";
        expected = 5;
        actual = clz.maxPower(s);
        assertEquals(expected, actual);
    }

    @Test
    public void test4(){
        s = "hooraaaaaaaaaaay";
        expected = 11;
        actual = clz.maxPower(s);
        assertEquals(expected, actual);
    }

    @Test
    public void test5(){
        s = "tourist";
        expected = 1;
        actual = clz.maxPower(s);
        assertEquals(expected, actual);
    }
}
