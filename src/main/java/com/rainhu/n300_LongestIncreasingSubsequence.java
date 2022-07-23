package com.rainhu;

import java.util.Arrays;

/**
 * 300. Longest Increasing Subsequence (Medium)
 * 
 * Given an integer array nums, return the length of the longest strictly increasing subsequence.
 * 
 * A subsequence is a sequence that can be derived from an array by deleting some or no elements without changing the order of the remaining elements. 
 * For example, [3,6,2,7] is a subsequence of the array [0,3,1,6,2,2,7].
 * 
 * @author: Rain Hu
 * @version: 2
 * @since: 2022/7/20
 * @apiNote: dynamic programming, binary search
 */

public class n300_LongestIncreasingSubsequence {
    // best solution: dp + binary search
    public int lengthOfList(int[] nums){
        int n = nums.length;
        int[] dp = new int[n];
        int len = 0;
        for (int num : nums){
            int i = Arrays.binarySearch(dp, 0, len, num);
            if (i < 0) i = -(i + 1);
            dp[i] = len;
            if (i == len) len++;
        }
        return len;
    }
    
    // dp
    public int lengthOfList2(int[] nums){
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        int res = 1;
        for (int i = n-1; i >= 0; i--){
            for (int j = i + 1; j < n; j++){
                if (nums[j] > nums[i]){
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                    res = Math.max(dp[i], res);
                }
            }
        }
        return res;
    }
}
