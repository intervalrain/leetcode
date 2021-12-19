package com.rainhu;

import java.util.Arrays;

/**
 * 16. 3Sum Closest(Medium)
 * 
 * Given an array nums of n integers and an integer target, 
 * find three integers in nums such that the sum is closest to target.
 * Return the sum of the three integers.
 * You may assume that each input would have exactly one solution.
 */

public class n16_3SumClosest {

    public int threeSumClosest(int[] nums, int target){
        Arrays.sort(nums);
        int result = nums[0] + nums[1] + nums[2];
        int minDiff = result - target;
        for (int i=0; i<nums.length; i++){
            int p = i+1;
            int q = nums.length-1;
            int sum = 0;
            while(p<q){
                sum = nums[i] + nums[p] + nums[q];
                
                if(minDiff == 0)
                    return target;
                if(Math.abs(sum-target) < Math.abs(minDiff))
                    minDiff = sum - target;

                if(sum-target>0)
                    q--;
                else
                    p++;
                
            }
        }
        return target + minDiff;
    }    
}