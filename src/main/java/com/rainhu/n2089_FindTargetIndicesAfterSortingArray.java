package com.rainhu;

import java.util.List;
import java.util.ArrayList;

/**
 * 2089. Find Target Indices After Sorting Array (Easy)
 * 
 * You are given a 0-indexed integer array nums and a target element target.
 * 
 * A target index is an index i such that nums[i] == target.
 * 
 * Return a list of the target indices of nums after sorting nums in non-decreasing order.
 * If there are no target indices, return an empty list.
 * The returned list must be sorted in increasing order.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2021/12/10
 * @apiNote
 */
public class n2089_FindTargetIndicesAfterSortingArray {
    public List<Integer> targetIndices(int[] nums, int target){
        int left = 0;
        int right = nums.length;
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < nums.length; i++){
            if (nums[i] < target)
                left++;
            else if (nums[i] > target)
                right--;
        }
        for (int i = left; i < right; i++)
            arr.add(i);
        return arr;
    }
}
