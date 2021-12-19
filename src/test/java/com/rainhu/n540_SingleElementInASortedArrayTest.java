package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n540_SingleElementInASortedArrayTest {
 
    n540_SingleElementInASortedArray clz = new n540_SingleElementInASortedArray();
    int[] nums;
    int expected;
    int actual;

    @Test
    public void test1(){
        nums = new int[]{1,1,2,3,3,4,4,8,8};
        expected = 2;
        actual = clz.singleNonDuplicate(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        nums = new int[]{3,3,7,7,10,11,11};
        expected = 10;
        actual = clz.singleNonDuplicate(nums);
        assertEquals(expected, actual);
    }
}
