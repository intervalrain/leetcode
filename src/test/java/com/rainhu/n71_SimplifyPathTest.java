package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n71_SimplifyPathTest {
    
    n71_SimplifyPath clz = new n71_SimplifyPath();
    String path;
    String expected, actual;

    @Test
    public void test1(){
        path = "/home/";
        expected = "/home";
        actual = clz.simplifyPath(path);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        path = "/../";
        expected = "/";
        actual = clz.simplifyPath(path);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        path = "/home//foo/";
        expected = "/home/foo";
        actual = clz.simplifyPath(path);
        assertEquals(expected, actual);
    }

    @Test
    public void test4(){
        path = "/a/./b/../../c/";
        expected = "/c";
        actual = clz.simplifyPath(path);
        assertEquals(expected, actual);
    }

    @Test
    public void test5(){
        path = "/a//b////c/d//././/..";
        expected = "/a/b/c";
        actual = clz.simplifyPath(path);
        assertEquals(expected, actual);
    }
}
