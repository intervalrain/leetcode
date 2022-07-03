package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.rainhu.util.Snippet;

import org.junit.jupiter.api.Test;

public class n462_MinimumMovesToEqualArrayElementIITest {
    
    n462_MinimumMovesToEqualArrayElementII clz = new n462_MinimumMovesToEqualArrayElementII();
    int[] nums;
    int expected, actual;

    @Test
    public void test1(){
        nums = Snippet.stringToIntegerArray("[1,2,3]");
        expected = 2;
        actual = clz.minMoves2(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        nums = Snippet.stringToIntegerArray("[1,10,2,9]");
        expected = 16;
        actual = clz.minMoves2(nums);
        assertEquals(expected, actual);
    }
}
