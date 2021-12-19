package com.rainhu;

/**
 * 198. House Robber (Medium)
 * 
 * You are a professional robber planning to rob houses along a street.
 * Each house has a certain amount of money stashed,
 * the only constraint stopping you from robbing each of them is that adjacent houses have security systems connected and 
 * it will automatically contact the police if two adjacent houses were broken into on the same night.
 * 
 * Given an integer array nums representing the amount of money of each house,
 * return the maximum amount of money you can rob tonight without alerting the police
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2021/12/1
 * @apiNote: dp
 */

public class n198_HouseRobber {
    public int rob(int[] nums){
        int n = nums.length;
        if (n == 1) return nums[0];
        if (n == 2) return Math.max(nums[0], nums[1]);
        nums[2] += nums[0];
        for (int i = 3; i < n; i++)
            nums[i] += Math.max(nums[i-2], nums[i-3]);
        return Math.max(nums[n-1], nums[n-2]);
    }
}
