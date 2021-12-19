package com.rainhu;

/**
 * 35. Search Insert Position (Easy)
 * Given a sorted array of dstinct integers and a target value,
 * return the index if the target is found.
 * If not, return the index where it would be if it were inserted in order.
 * 
 * You must write an algorithm with O(log n) runtime complextiy.
 * 
 * @author: Rain Hu
 * @version: 2
 * @since: 2021/11/26
 * @apiNote
 */

public class n35_SearchInsertPosition{
    public int searchInsert(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;
        if (target <= nums[left]) return left;
        if (target > nums[right]) return right + 1;
        while (right > left){
            int mid = left + (right - left) / 2;
            if (nums[mid] > target){
                right = mid;
            } else if (nums[mid] < target){
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return left;
    }
}