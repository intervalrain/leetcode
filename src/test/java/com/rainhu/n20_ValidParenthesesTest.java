package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n20_ValidParenthesesTest {
    
    n20_ValidParentheses clz = new n20_ValidParentheses();
    String s;
    boolean expected, actual;

    @Test
    public void test1(){
        s = "()";
        expected = true;
        actual = clz.isValid(s);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        s = "()[]{}";
        expected = true;
        actual = clz.isValid(s);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        s = "(]";
        expected = false;
        actual = clz.isValid(s);
        assertEquals(expected, actual);
    }
}
