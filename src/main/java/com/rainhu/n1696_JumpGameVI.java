package com.rainhu;

import com.rainhu.util.Snippet;

/**
 * 1696. Jump Game VI (Medium)
 * 
 * You are given a 0-indexed integer array nums and an integer k.
 * 
 * You are initially standing at index 0.
 * In one move, you can jump at most k steps forward without going outside the boundaries of the array.
 * That is, you can jump from index i to any index in the range [i + 1, min(n - 1, i + k)] inclusive.
 * 
 * You want to reach the last index of the array (index n - 1). 
 * Your score is the sum of all nums[j] for each index j you visited in the array.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/7/10
 * @apiNote: dynamic programming
 */

public class n1696_JumpGameVI {
    public static void main(String[] args){
        int[] nums = Snippet.stringToIntegerArray("[10,-5,-2,4,0,3]");
        int k = 3;
        System.out.println(new n1696_JumpGameVI().maxResult(nums, k));
    }

    public int maxResult(int[] nums, int k){
        int n = nums.length;
        int[] dp = new int[n];
        dp[0] = nums[0];
        int max = dp[0];
        int idx = 0;
        for (int i = 1; i < n; i++){
            // outside k's range, adjust the availale max for i's position
            if (i - idx > k){
                max = dp[i - k];
                idx = i - k;
                for (int j = i - k + 1; j < i; j++){
                    if (dp[j] >= max){
                        max = dp[j];
                        idx = j;
                    }
                }
            }
            dp[i] = max + nums[i];
            if (nums[i] > 0){
                max = dp[i];
                idx = i;
            }
        }
        return dp[n-1];
    }
}