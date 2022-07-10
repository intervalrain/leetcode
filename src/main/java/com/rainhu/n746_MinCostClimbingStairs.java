package com.rainhu;

/**
 * 746. Min Cost Climbing Stairs (Easy)
 * 
 * You are given an integer array cost where cost[i] is the cost of ith step on a staircase.
 * Once you pay the cost, you can either climb one ore two steps.
 * 
 * You can either start from step with step 0, or the step with index 1.
 * 
 * Return the minimum cost to reach the top of the floor.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/7/11
 * @apiNote: dynamic programming
 */

public class n746_MinCostClimbingStairs {
    
    public int MinCostClimbingStairs(int[] cost){
        int n = cost.length;
        int[] dp = new int[n];
        dp[0] = cost[0];
        dp[1] = cost[1];

        for (int i = 2; i < n; i++){
            dp[i] = cost[i] + Math.min(dp[i-1], dp[i-2]);
        }

        return Math.min(dp[n-1],dp[n-2]);
    }
}
