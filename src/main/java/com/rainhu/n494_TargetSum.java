package com.rainhu;

/**
 * 494. Target Sum (Median)
 * 
 * You are given an integer array nums and an integer target.
 * You want to build an expression out of nums by adding one of the symbols '+' and '-' before each integer in nums and then concatenate all the integers.
 * For example, if nums = [2, 1], you can add a '+' before 2 and a '-' before 1 and concatenate them to build the expression "+2-1".
 * Return the number of different expressions that you can build, which evaluates to target.
 */

public class n494_TargetSum {
    public int findTargetSumWays(int[] nums, int target){
        int sum = 0;
        for (int i=0; i<nums.length; i++)
            sum += nums[i];
        if ((target + sum) % 2 == 1 || Math.abs(target) > sum)
            return 0;
        return subsetSum(nums, (target+sum)/2);
    }
    public int subsetSum(int[] nums, int target){
        int[] dp = new int[target+1];
        dp[0] = 1;

        for (int n: nums){
            for (int i=target; i>=n; i--)
                dp[i] += dp[i-n];
        }

        return dp[target];
    }
}

       




