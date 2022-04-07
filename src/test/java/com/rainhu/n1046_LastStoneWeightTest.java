package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n1046_LastStoneWeightTest {
    
    n1046_LastStoneWeight clz = new n1046_LastStoneWeight();
    int[] stones;
    int expected, actual;

    @Test
    public void test1(){
        stones = new int[]{2,7,4,1,8,1};
        expected = 1;
        actual = clz.lastStoneWeight(stones);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        stones = new int[]{1};
        expected = 1;
        actual = clz.lastStoneWeight(stones);
        assertEquals(expected, actual);
    }
}
