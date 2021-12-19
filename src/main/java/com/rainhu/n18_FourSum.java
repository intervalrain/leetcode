package com.rainhu;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * 18. 4Sum (Medium)
 * 
 * Given an array of n integers, return an array of all the unique quadruplets [num[a], num[b], num[c], num[d]]
 * such that:
 * 0 <= a, b, c, d < n
 * You may return the answer in any order
 */

public class n18_FourSum{
    public List<List<Integer>> fourSum(int[] nums, int target){
        ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();
        int len = nums.length;
        if(nums == null || len < 4)
            return res;

        Arrays.sort(nums);
        
        for(int i=0; i<len-3; i++){
            for(int j=i+1; j<len-2; j++){
                int left = j+1;
                int right = len-1;
                int lrTarget = target - nums[i] - nums[j];
                while(left < right){
                    if(lrTarget < 2*nums[left] || lrTarget > 2*nums[right]){
                        break;
                    } else if(lrTarget < nums[left] + nums[right]){
                        right--;
                        while(nums[right]==nums[right+1] && left<right)
                            right--;
                    } else if(lrTarget > nums[left] + nums[right]){
                        left++;
                        while(nums[left]==nums[left-1] && left<right)
                            left++;
                    } else {
                        res.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        left++;
                        while(nums[left]==nums[left-1] && left<right)
                            left++;
                    }
                }   
                while(nums[j+1]==nums[j] && j<len-2)
                    j++;
            }
            while(nums[i+1]==nums[i] && i<len-3)
                i++;

        }
        return res;
    }
}

