package com.rainhu;

/**
 * 905. Sort Array By Parity (Easy)
 * 
 * Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.
 * Return any array that satisfies this condition.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/5/2
 * @apiNote
 */

public class n905_SortArrayByParity {
    void swap(int[] nums, int a, int b){
        int tmp = nums[a];
        nums[a] = nums[b];
        nums[b] = tmp;
    }
    public int[] sortArrayByParity(int[] nums){
        int left = 0, right = nums.length - 1;
        while (left <= right){
            if (nums[right] % 2 == 0)
                swap(nums, left++, right);
            else
                right--;
        }
        return nums;
    }
}
