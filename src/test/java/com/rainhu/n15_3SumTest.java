package com.rainhu;

import org.junit.jupiter.api.Test;

import java.util.List;

import java.util.Arrays;

public class n15_3SumTest{

    n15_3Sum clz = new n15_3Sum();
    int[] nums;
    List<List<Integer>> actual, expected;

    // public boolean isMatch(List<List<Integer>> act, List<List<Integer>> exp){
    //     if(act.size() != exp.size())
    //         return false;
        
    // }

    @Test
    public void test1(){
        nums = new int[]{-1,0,1,2,-1,-4};
        actual = clz.threeSum(nums);
        expected = Arrays.asList(Arrays.asList(-1,-1,2), Arrays.asList(-1,0,1));
        // assertTrue(isMatch(actual, expected));
        
    }
}