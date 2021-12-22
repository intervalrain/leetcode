package com.rainhu;

/**
 * 416. Partition Eqaul Subset Sum (Medium)
 * 
 * Given a non-empty array nums containing only positive integers,
 * find if the array can be partitoned into two subsets such that the sum of elements in both subsets is equal.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2021/12/13
 * @apiNote: knapsack, dp
 */

public class n416_PartitionEqualSubsetSum {
    public boolean canPartition(int[] nums){
        int sum = 0;
        for (int i = 0; i < nums.length; i++)
            sum += nums[i];
        if (sum % 2 != 0) return false;
        sum /= 2;
        boolean[] dp = new boolean[sum + 1];
        
        dp[0] = true;
        for (int i = 0; i < nums.length; i++){
            for (int j = sum; j >= nums[i]; j--){
                dp[j] = dp[j] || dp[j - nums[i]];
            }
        }
        return dp[sum];
    }

}
