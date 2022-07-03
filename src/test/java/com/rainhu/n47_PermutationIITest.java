package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;

import com.rainhu.util.ListTest;

import org.junit.jupiter.api.Test;

public class n47_PermutationIITest {
    
    n47_PermutationII clz = new n47_PermutationII();
    int[] nums;
    List<List<Integer>> expected, actual;

    @Test
    public void test1(){
        nums = new int[]{1,2,3};
        expected = Arrays.asList(Arrays.asList(1,2,3),Arrays.asList(1,3,2),Arrays.asList(2,1,3),Arrays.asList(2,3,1),Arrays.asList(3,1,2),Arrays.asList(3,2,1));
        actual = clz.permuteUnique(nums);
        assertTrue(ListTest.intEquals(expected, actual));
    }

    @Test
    public void test2(){
        nums = new int[]{1,1,2};
        expected = Arrays.asList(Arrays.asList(1,1,2),Arrays.asList(1,2,1),Arrays.asList(2,1,1));
        actual = clz.permuteUnique(nums);
        assertTrue(ListTest.intEquals(expected, actual));
    }
}
