package com.rainhu;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 1713. You are given an array target that consists of distinct integers and another integer array arr that can have duplicates.
 * In one operation, you can insert any integer at any position in arr. 
 * For example, if arr = [1,4,1,2], you can add 3 in the middle and make it [1,4,3,1,2]. 
 * Note that you can insert the integer at the very beginning or end of the array.
 * 
 * Return the minimum number of operations needed to make target a subsequence of arr.
 * 
 * A subsequence of an array is a new array generated from the original array by deleting some elements (possibly none) without changing the remaining elements' relative order. For example, [2,7,4] is a subsequence of [4,2,3,7,2,1,4] (the underlined elements), while [2,4,2] is not.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/8/3
 * @apiNote: dynamic programming, binary search, LIS(longest increasing subsequence)
 */

public class n1713_MinimumOperationsToMakeASubsequence {
    public int minOperations(int[] target, int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < target.length; i++){
            map.put(target[i], i);
        }
        int[] dp = new int[target.length];
        Arrays.fill(dp, Integer.MAX_VALUE);
        int len = 0;

        for (int i = 0; i < arr.length; i++){
            if (map.containsKey(arr[i])){
                int pos = lower_bound(dp, map.get(arr[i]), len);
                dp[pos] = map.get(arr[i]);
                if (pos == len) len++;
            }
        }
        return target.length - len;
    }

    int lower_bound(int[] nums, int target, int len){
        int left = 0, right = len;
        while (left <= right){
            int mid = left + (right - left)/2;
            if (nums[mid] < target){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}
