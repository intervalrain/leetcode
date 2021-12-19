package com.rainhu;

/**
 * 34. Find First and Last Position of Element in Sorted Array (Medium)
 * 
 * Given an array of integers nums sorted in non-decreasing order,
 * find the starting and ending position of a given target value.
 * 
 * If target is not found in the array, return [-1, -1];
 * 
 * You must write an algorithm with O(log n) runtime complexity.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2021/12/14
 * @apiNote
 */

public class n34_FindFirstAndLastPositionOfElementInSortedArray {
    public int[] searchRange(int[] nums, int target){
        int left = -1;
        int right = -1;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == target){
                left = i;
                break;
            }
        }
        if (left == -1) return new int[]{-1,-1};
        for (int i = left; i < nums.length; i++){
            if (nums[i] != target){
                right = i - 1;
                break;
            }
        }
        if (right == -1) return new int[]{left, nums.length - 1};
        return new int[]{left, right};
    }
}
