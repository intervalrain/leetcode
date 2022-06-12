package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n1695_MaximumErasureValueTest {
    
    n1695_MaximumErasureValue clz = new n1695_MaximumErasureValue();
    int[] nums;
    int expected, actual;

    @Test
    public void test1(){
        nums = new int[]{4,2,4,5,6};
        expected = 17;
        actual = clz.maximumUniqueSubarray(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        nums = new int[]{5,2,1,2,5,2,1,2,5};
        expected = 8;
        actual = clz.maximumUniqueSubarray(nums);
        assertEquals(expected, actual);
    }
}
