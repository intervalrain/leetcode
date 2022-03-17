package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n856_ScoreOfParenthesesTest {
    
    n856_ScoreOfParentheses clz = new n856_ScoreOfParentheses();
    String s;
    int expected, actual;

    @Test
    public void test1(){
        s = "()";
        expected = 1;
        actual = clz.scoreOfParentheses(s);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        s = "(())";
        expected = 2;
        actual = clz.scoreOfParentheses(s);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        s = "()()";
        expected = 2;
        actual = clz.scoreOfParentheses(s);
        assertEquals(expected, actual);
    }

    @Test
    public void test4(){
        s = "(())(((())))";
        expected = 10;
        actual = clz.scoreOfParentheses(s);
        assertEquals(expected, actual);
    }
}
