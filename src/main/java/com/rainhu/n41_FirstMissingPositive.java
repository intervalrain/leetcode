package com.rainhu;

/**
 * 41. First Missing Positive (Hard)
 * 
 * Given an unsorted integer array nums,
 * return the smallest missing positive integer.
 * 
 * You must implement an algorithm that runs in O(n) time and uses constant extra space.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/2/14
 * @apiNote
 */
public class n41_FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        for (int i = 0; i < nums.length; i++){
            int curr = nums[i];
            while (curr != i + 1 && curr > 0 && curr <= nums.length){
                int tmp = nums[curr-1];
                if (curr == tmp) break;;
                nums[curr-1] = curr;
                curr = nums[i] = tmp;
            }
        }
        int i;
        for (i = 0; i < nums.length; i++){
            if (nums[i] != i + 1)
                break;
        }
        return i + 1;
    }
}

