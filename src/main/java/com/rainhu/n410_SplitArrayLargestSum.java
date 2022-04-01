package com.rainhu;

/**
 * 410. Split Array Largest Sum (Hard)
 * 
 * Given an array nums which consists of non-negative integers and an integer m,
 * you can split the array into m non-empty conitnuous subarrays.
 * 
 * Write an algorithm to minimize the largest sum among these m subarrays.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/4/1
 * @apiNote: (1) dp
 *           (2) binary search
 */

public class n410_SplitArrayLargestSum{

    // (1) dp
    public int splitArray(int[] nums, int m){
        int n = nums.length;
        int[][] dp = new int[m][n];
        dp[0][0] = nums[0];
        for (int i = 1; i < n; i++){
            dp[0][i] = dp[0][i-1] + nums[i];
        }
        for (int j = 1; j < m; j++){
            for (int i = j; i < n; i++){
                int min = Integer.MAX_VALUE;
                for (int k = j - 1; k < i; k++){
                    int left = dp[j-1][k];
                    int right = dp[0][i]-dp[0][k];
                    int max = Math.max(left, right);
                    min = Math.min(min, max);
                }
                dp[j][i] = min;
            }
        }
        return dp[m-1][n-1];
    }

    // binary search
    public int splitArrayBS(int[] nums, int m) {
        // find the min number of the subarray sum
        // binary search the result
        if (nums == null || nums.length == 0) {
            return 0;
        }
        // left is the largest value in nums
        // right = sum of all value in nums
        int left = 0, right = 0;
        for (int i : nums) {
            left = Math.max(left, i);
            right += i;
        }
        while (left < right) {
            int mid = left + (right - left) / 2;
            // if the number of subarrays is not larger than m, mid could be smaller
            if (valid(mid, nums, m)) {
                right = mid;
            } else {  // if the number of subarray is larger than m, mid should be larger
                left = mid + 1;
            }
        }
        return left;
    }
    private boolean valid(int t, int[] nums, int m) {
        // greedy: max the subarry sum < t
        int cnt = 0, j = 0;
        for (int i = 0; i < nums.length; i++) {
            j = i;
            int sum = 0;
            while (j < nums.length && sum + nums[j] <= t) {
                sum += nums[j];
                j++;
            }
            i = j - 1;
            cnt++;
        }
        return cnt <= m;
    }
}