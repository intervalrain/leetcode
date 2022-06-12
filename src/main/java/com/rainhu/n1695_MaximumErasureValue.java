package com.rainhu;

import java.util.HashSet;
import java.util.Set;

/**
 * 1695. Maximum Erasure Value (Medium)
 * 
 * You are given an array of positive integers nums and want to erase a subarray containing unique elements.
 * The score you get by erasing the subarray is equal to the sum of its elements.
 * 
 * Return the maximum score you can get by erasing exactly one subarray.
 * 
 * An array b is called to be a subarray of a if it forms a contiguous subsequence of a,
 * that is, if it is equal to a[l], a[l+1], ...,a[r] for some (l,r).
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/6/12
 * @apiNote
 */

public class n1695_MaximumErasureValue {
    public int maximumUniqueSubarray(int[] nums){

        Set<Integer> set = new HashSet<>();
        int sum = 0, res = 0;
        int i = 0, j = 0;

        while (i < nums.length && j < nums.length){
            if (!set.contains(nums[j])){
                sum += nums[j];
                res = Math.max(sum, res);
                set.add(nums[j++]);
            } else {
                sum = sum - nums[i];
                set.remove(nums[i++]);
            }
        }
        return res;
    }
}
