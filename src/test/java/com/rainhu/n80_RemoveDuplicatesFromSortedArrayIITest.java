package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class n80_RemoveDuplicatesFromSortedArrayIITest {
    
    n80_RemoveDuplicatesFromSortedArrayII clz = new n80_RemoveDuplicatesFromSortedArrayII();
    int[] nums;
    int k;
    int[] expected;
    int[] actual;

    @Test
    public void test1(){
        nums = new int[]{1,1,1,2,2,3};
        expected = new int[]{1,1,2,2,3};
        k = clz.removeDuplicates(nums);
        actual = new int[k];
        System.arraycopy(nums, 0, actual, 0, k);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void test2(){
        nums = new int[]{0,0,1,1,1,1,2,3,3};
        expected = new int[]{0,0,1,1,2,3,3};
        k = clz.removeDuplicates(nums);
        actual = new int[k];
        System.arraycopy(nums, 0, actual, 0, k);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void test3(){
        nums = new int[]{1,1,1};
        expected = new int[]{1,1};
        k = clz.removeDuplicates(nums);
        actual = new int[k];
        System.arraycopy(nums, 0, actual, 0, k);
        assertArrayEquals(expected, actual);
    }
}
