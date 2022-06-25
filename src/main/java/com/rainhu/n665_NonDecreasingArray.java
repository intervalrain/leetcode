package com.rainhu;

/**
 * 665. Non-decreasing Array (Medium)
 * 
 * Given an array nums with n integers,
 * your task is to check if it could become non-decreasing by modifying at most one element.
 * 
 * We define an array is non-decreasing if nums[i] <= nums[i+1] holds for every i (0-based) such that (0 <= i <= n-2).
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/6/26
 * @apiNote
 */

public class n665_NonDecreasingArray{
    public boolean checkPossibility(int[] nums){
        for (int i = 1; i < nums.length; i++){
            if (nums[i-1] > nums[i]){
                int a = nums[i-1];
                int b = nums[i];
                nums[i-1] = b;
                boolean A = isValid(nums);
                nums[i-1] = a;
                nums[i] = a;
                boolean B = isValid(nums);
                return A || B;
            }
        }
        return true;
    }
    private boolean isValid(int[] nums){
        for (int i = 1; i < nums.length; i++){
            if (nums[i-1] > nums[i])
                return false;
        }
        return true;
    }
}