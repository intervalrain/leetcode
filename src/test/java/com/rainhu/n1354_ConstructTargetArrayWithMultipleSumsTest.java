package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n1354_ConstructTargetArrayWithMultipleSumsTest {
    
    n1354_ConstructTargetArrayWithMultipleSums clz = new n1354_ConstructTargetArrayWithMultipleSums();
    int[] target;
    boolean expected, actual;

    @Test
    public void test1(){
        target = new int[]{9,3,5};
        expected = true;
        actual = clz.isPossible(target);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        target = new int[]{1,1,12};
        expected = false;
        actual = clz.isPossible(target);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        target = new int[]{8,5};
        expected = true;
        actual = clz.isPossible(target);
        assertEquals(expected, actual);
    }

    @Test
    public void test4(){
        target = new int[]{10000000,1};
        expected = true;
        actual = clz.isPossible(target);
        assertEquals(expected, actual);
    }

    @Test
    public void test5(){
        target = new int[]{1,1,1,2};
        expected = false;
        actual = clz.isPossible(target);
        assertEquals(expected, actual);
    }

    @Test
    public void test6(){
        target = new int[]{5,2};
        expected = true;
        actual = clz.isPossible(target);
        assertEquals(expected, actual);
    }
}
