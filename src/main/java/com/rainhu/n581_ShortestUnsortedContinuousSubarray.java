package com.rainhu;

/**
 * 581. Shortest Unsorted Continuous Subarray (Medium)
 * 
 * Given an integer array nums, you need to fine ond continuous subarray that if you only sort this subarray in ascending order,
 * then the whole array will be sorted in ascending order.
 * 
 * Return the shortest such subarray and output its length.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/5/3
 * @apiNote
 */

public class n581_ShortestUnsortedContinuousSubarray {
    public int findUnsortedSubarray(int[] nums){
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int left = -1;
        int right = -1;
        for (int i = 0; i < n; i++){
            if (nums[i] > max)
                max = nums[i];
            else
                right = i;
        }
        for (int i = n - 1; i >= 0; i--){
            if (nums[i] < min)
                min = nums[i];
            else
                left = i;
        }
        if (right == -1) return 0;
        return right - left + 1;
    }
}
