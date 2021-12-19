package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class n394_DecodeStringTest {
    
    n394_DecodeString clz = new n394_DecodeString();
    String s;
    String expected;
    String actual;

    @Test
    public void test1(){
        s = "3[a]2[bc]";
        expected = "aaabcbc";
        actual = clz.decodeString(s);
        assertTrue(expected.equals(actual));
    }

    @Test
    public void test2(){
        s = "3[a2[c]]";
        expected = "accaccacc";
        actual = clz.decodeString(s);
        assertTrue(expected.equals(actual));
    }

    @Test
    public void test3(){
        s = "2[abc]3[cd]ef";
        expected = "abcabccdcdcdef";
        actual = clz.decodeString(s);
        assertTrue(expected.equals(actual));
    }

    @Test
    public void test4(){
        s = "abc3[cd]xyz";
        expected = "abccdcdcdxyz";
        actual = clz.decodeString(s);
        assertTrue(expected.equals(actual));
    }

    @Test
    public void test5(){
        s = "10[leetcode]";
        expected = "leetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcode";
        actual = clz.decodeString(s);
        assertTrue(expected.equals(actual));
    }
}
