package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n1345_JumpGameIVTest {
    
    n1345_JumpGameIV clz = new n1345_JumpGameIV();
    int[] arr;
    int expected;
    int actual;

    @Test
    public void test1(){
        arr = new int[]{100,-23,-23,404,100,23,23,23,3,404};
        expected = 3;
        actual = clz.minJumps(arr);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        arr = new int[]{7};
        expected = 0;
        actual = clz.minJumps(arr);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        arr = new int[]{7,6,9,6,9,6,9,7};
        expected = 1;
        actual = clz.minJumps(arr);
        assertEquals(expected, actual);
    }
}
