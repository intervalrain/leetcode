package com.rainhu;

/**
 * 1480. Running Sum of 1d Array (Easy)
 * 
 * Given an array nums.
 * We define a running sum of an array as runningSum[i] = sum(nums[0] ... nums[1]).
 * 
 * Return the running sum of nums.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/6/2
 * @apiNote: array
 */

public class n1480_RunningSumOf1dArray {
    public int[] runningSum(int[] nums){
        for (int i = 1; i < nums.length; i++){
            nums[i] += nums[i-1];
        }
        return nums;
    }
}
