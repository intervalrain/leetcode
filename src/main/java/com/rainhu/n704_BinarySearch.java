package com.rainhu;

/**
 * 704. Binary Search (Easy)
 * 
 * Given an array of integers nums which is sorted in ascending order,
 * and an integer target, write a function to search target in nums.
 * If target exists, then return its index.
 * Otherwise, return -1.
 * 
 * You must write and algorithm with O(log n) runtime complexity.
 */

public class n704_BinarySearch {
    public int search(int[] nums, int target){
        int left = 0;
        int right = nums.length-1;
        if (left == right)
            return nums[0] == target ? 0 : -1;

        int mid = left + (right - left) / 2;
        while (right >= left){
            if (nums[mid] == target){
                return mid;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
            mid = left + (right - left)/2;
        }
        return -1;
    }
}
