package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n416_PartitionEqualSubsetSumTest {
    
    n416_PartitionEqualSubsetSum clz = new n416_PartitionEqualSubsetSum();
    int[] nums;
    boolean expected;
    boolean actual;

    @Test
    public void test1(){
        nums = new int[]{1,5,11,5};
        expected = true;
        actual = clz.canPartition(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        nums = new int[]{1,2,3,5};
        expected = false;
        actual = clz.canPartition(nums);
        assertEquals(expected, actual);
    }
}
