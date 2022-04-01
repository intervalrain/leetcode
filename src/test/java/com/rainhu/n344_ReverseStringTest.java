package com.rainhu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class n344_ReverseStringTest {

    n344_ReverseString clz = new n344_ReverseString();
    char[] s, expected;

    @Test
    public void test1(){
        s = new char[]{'h', 'e', 'l', 'l', 'o'};
        expected = new char[]{'o', 'l', 'l', 'e', 'h'};
        clz.reverseString(s);
        assertArrayEquals(s, expected);
    }

    @Test
    public void test2(){
        s = new char[]{'H', 'a', 'n', 'n', 'a', 'h'};
        expected = new char[]{'h', 'a', 'n', 'n', 'a', 'H'};
        clz.reverseString(s);
        assertArrayEquals(s, expected);
    }
}
