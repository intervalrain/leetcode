package com.rainhu;

/**
 * 1413. Minimum Value to Get Positive Step by Step Sum (Easy)
 * 
 * Given an array of integers nums, you start with an initial positive value startValue.
 * 
 * In each iteration, you calculate the step by step sum of startValue plus elements nums (from left to right).
 * 
 * Return the minimum positive value of startValue such that the step by step sum is never less than 1.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2021/11/11
 * @apiNote: easy
 */

public class n1413_MinimumValueToGetPositiveStepByStepSum {
    public int minStartValue(int[] nums){
        int min = 1;
        int sum = 0;
        for (int i = 0; i < nums.length; i++){
            sum += nums[i];
            if (sum < min) min = sum;
        }
        return min == 1 ? 1 : 1-min;
    }
}
