package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n1209_RemoveAllAdjacentDuplicatesInStringIITest {
    
    n1209_RemoveAllAdjacentDuplicatesInStringII clz = new n1209_RemoveAllAdjacentDuplicatesInStringII();
    String s;
    int k;
    String expected, actual;

    @Test
    public void test1(){
        s = "abcd";
        k = 2;
        expected = "abcd";
        actual = clz.removeDuplicates(s, k);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        s = "deeedbbcccbdaa";
        k = 3;
        expected = "aa";
        actual = clz.removeDuplicates(s, k);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        s = "pbbcggttciiippooaais";
        k = 2;
        expected = "ps";
        actual = clz.removeDuplicates(s, k);
        assertEquals(expected, actual);
    }
}
