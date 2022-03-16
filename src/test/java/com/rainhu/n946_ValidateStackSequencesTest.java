package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n946_ValidateStackSequencesTest {
    
    n946_ValidateStackSequences clz = new n946_ValidateStackSequences();
    int[] pushed, popped;
    boolean expected, actual;

    @Test
    public void test1(){
        pushed = new int[]{1,2,3,4,5};
        popped = new int[]{4,5,3,2,1};
        expected = true;
        actual = clz.validateStackSequences(pushed, popped);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        pushed = new int[]{1,2,3,4,5};
        popped = new int[]{4,3,5,1,2};
        expected = false;
        actual = clz.validateStackSequences(pushed, popped);
        assertEquals(expected, actual);
    }

}
