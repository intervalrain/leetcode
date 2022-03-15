package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class n1249_MinimumRemoveToMakeValidParenthesesTest {
    
    n1249_MinimumRemoveToMakeValidParentheses clz = new n1249_MinimumRemoveToMakeValidParentheses();
    String s;
    String expected, actual;

    @Test
    public void test1(){
        s = "lee(t(c)o)de)";
        String exp1 = "lee(t(c)o)de";
        String exp2 = "lee(t(c)ode)";
        String exp3 = "lee(t(co)de)";
        actual = clz.minRemoveToMakeValid(s);
        assertTrue(actual.equals(exp1) || actual.equals(exp2) || actual.equals(exp3));
    }

    @Test
    public void test2(){
        s = "a)b(c)d";
        expected = "ab(c)d";
        actual = clz.minRemoveToMakeValid(s);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        s = "))((";
        expected = "";
        actual = clz.minRemoveToMakeValid(s);
        assertEquals(expected, actual);
    }

    @Test
    public void test4(){
        s = "())()(((";
        expected = "()()";
        actual = clz.minRemoveToMakeValid(s);
        assertEquals(expected, actual);
    }
}
