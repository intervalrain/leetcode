package com.rainhu;

/**
 * 312. Burst Balloons (Hard)
 * 
 * You are given n balloons, indexed from 0 to n - 1.
 * Each balloon is painted with a number on it represented by an array nums.
 * You are asked to burst all the balloons.
 * 
 * If you burst the ith balloon, you will get nums[i - 1] * nums[i] * nums[i + 1] coins.
 * If i - 1 or i + 1 goes out of bounds of array,
 * then treat it as if there is a balloon with 1 painted on it.
 * 
 * Return the maximum coins you can collect by bursting the balloons wisely.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/1/1
 * @apiNote: O(3) not solved
 */

public class n312_BurstBalloons{
    public int maxCoins(int[] nums){
        int n = nums.length + 2;
        int[] arr = new int[n];
        int[][] dp = new int[n][n];

        arr[0] = arr[arr.length - 1] = 1;

        for (int i = 1; i <= nums.length; i++)
            arr[i] = nums[i-1];

        for (int len = 2; len < n; len++){
            for (int j = len; j < n; j++){
                int i = j - len;
                int prod = arr[i] * arr[j];
                int temp = 0;

                for (int k = i + 1; k < j; k++){
                    temp = Math.max(temp, dp[i][k] + dp[k][j] + arr[k] * prod);
                }

                dp[i][j] = temp;
            }
        }

        return dp[0][n-1];
    }

    public static void main(String[] args){
        int[] nums = new int[]{3,1,5,8};
        n312_BurstBalloons clz = new n312_BurstBalloons();
        System.out.println(clz.maxCoins(nums));
    }
}