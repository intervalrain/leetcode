package com.rainhu;

/**
 * 287. Find the Duplicate Number (Medium)
 * 
 * Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
 * 
 * There is only one repeated number in nums,
 * return this repeated number.
 * 
 * You must solve the problem without modifying the array nums and uses only constant extra space.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/3/30
 * @apiNote: Space complexity O(1)
 */

public class n287_FindTheDuplicateNumber {
    public int findDuplicate(int[] nums){
        int i = 0;
        while (true){
            while (nums[i] == i + 1) i++;
            if (nums[i] <= i || nums[i] == nums[nums[i] - 1]) break;
            swap(nums, i, nums[i] - 1);
        }
        return nums[i];
    }

    private void swap(int[] nums, int a, int b){
        int tmp = nums[a];
        nums[a] = nums[b];
        nums[b] = tmp;
    }
}
