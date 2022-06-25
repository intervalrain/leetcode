package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n665_NonDecreasingArrayTest {
    
    n665_NonDecreasingArray clz = new n665_NonDecreasingArray();
    int[] nums;
    boolean expected, actual;

    @Test
    public void test1(){
        nums = new int[]{4,2,3};;
        expected = true;
        actual = clz.checkPossibility(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        nums = new int[]{4,2,1};
        expected = false;
        actual = clz.checkPossibility(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        nums = new int[]{-1,4,2,3};
        expected = true;
        actual = clz.checkPossibility(nums);
        assertEquals(expected, actual);
    } 

    @Test
    public void test4(){
        nums = new int[]{3,4,2,3};
        expected = false;
        actual = clz.checkPossibility(nums);
        assertEquals(expected, actual);
    } 

    @Test
    public void test5(){
        nums = new int[]{5,7,1,8};
        expected = true;
        actual = clz.checkPossibility(nums);
        assertEquals(expected, actual);
    } 
}
