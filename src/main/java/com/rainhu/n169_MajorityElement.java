package com.rainhu;

import java.util.Arrays;

/**
 * 169. Majority Element (Easy)
 *
 * Given an array nums of size n,
 * return the majority element.
 *
 * The majority element is the element that appears more than [n/2] times.
 * You may assume that the majority element always exists in the array.
 *
 * @author: Rain Hu
 * @version: 2
 * @since: 2022/2/22
 * @apiNote:
 */

public class n169_MajorityElement{
    public int majorityElement2(int[] nums){
        Arrays.sort(nums);
        int n = nums.length;
        return nums[n/2];
    }

    /** Best solution */
    public int majorityElement(int[] nums){
        return helper(nums, 0);
    }

    private int helper(int[] nums, int start){
        int n = nums.length;
        int curr = 1;
        for (int i = start + 1; i < n; i++){
            if (nums[start] == nums[i])
                curr++;
            else 
                curr--;
            
            if (curr == 0)  // the majority of remaining numbers is the majority of the original array.
                return helper(nums, i+1);

        }
        return nums[start];  // never reach 0 means nums[start] is the majority.
    }
}
