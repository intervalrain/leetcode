package com.rainhu;

/**
 * 740. Delete and Earn
 * 
 * You are given an integer array nums.
 * You want to maximize the number of points you get by performing the following operation any number of times:
 *   + Pick any nums[i] and delete it to earn nums[i] points. 
 *     Afterwards, you must delete every element equal to nums[i] - 1 and every element equal to nums[i] + 1.
 * Return the maximum number of points you can earn by applying the above operation some number of times.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/3/5
 * @apiNote: dp
 */

public class n740_DeleteAndEarn {
    public int deleteAndEarn(int[] nums){
        int max = 0;
        int n = 10001;
        int[] values = new int[n];
        for (int num : nums){
            values[num] += num;
            max = Math.max(max, num);
        }
        if (max < 2) return values[1];
        int[] dp = new int[max+1];
        dp[0] = 0;
        dp[1] = values[1];
        dp[2] = values[2];
        for (int i = 3; i <= max; i++){
            dp[i] = values[i] + Math.max(dp[i-2], dp[i-3]);
        }
        return Math.max(dp[max], dp[max-1]);
    }
}
// [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
// [0, 0, 4, 9, 4, 5, 6,14,24,18]
// [0, 0, 4, 9, 8,14,17,28,41,46]
