package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class n89_GrayCodeTest {
    
    n89_GrayCode clz = new n89_GrayCode();
    int n;
    List<Integer> expected, actual;

    @Test
    public void test1(){
        n = 2;
        expected = Arrays.asList(0,1,3,2);
        actual = clz.grayCode(n);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        n = 1;
        expected = Arrays.asList(0,1);
        actual = clz.grayCode(n);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        n = 3;
        expected = Arrays.asList(0,1,3,2,6,7,5,4);
        actual = clz.grayCode(n);
        assertEquals(expected, actual);
    }

    @Test
    public void test4(){
        n = 4;
        expected = Arrays.asList(0,1,3,2,6,7,5,4,12,13,15,14,10,11,9,8);
        actual = clz.grayCode(n);
        assertEquals(expected, actual);
    }
}
