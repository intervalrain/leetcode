package com.rainhu;

/**
 * 53. Maximum Subarray (Easy)
 * Given an integer array nums, 
 * find the contiguous subarray (containing at least one number)
 * which has the larget sum and return its sum.
 * 
 * A subarray is a contiguous part of an array.
 * 
 * @author: Rain Hu
 * @version: 2
 * @since: 2021/11/26
 * @apiNote: Add when curr > 0
 */

public class n53_MaximumSubarray{
    public int maxSubArray(int[] nums){
        int max = Integer.MIN_VALUE;
        int curr = 0;
        for (int i=0; i<nums.length; i++){
            curr = Math.max(nums[i], nums[i] + curr);
            max = Math.max(curr, max);
        }
        return max;
    }
}