package com.rainhu;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 1679. Max Number of K-Sum Pairs (Medium)
 * 
 * You are given an integer array nums and integer k.
 * 
 * In one operation, you can pick two numbers from the array whose sum equals k and remove them from the array.
 * 
 * Return the maximum number of operations you can perform on the array.
 * 
 * @author: Rain Hu
 * @version: 2
 * @since: 2022/5/4
 * @apiNote:
 */

public class n1679_MaxNumberOfKSumPairs {

    // O(nlogn)
    public int maxOperations2(int[] nums, int k){
        Arrays.sort(nums);
        int cnt = 0;
        int l = 0, r = nums.length - 1;
        while (l < r){
            if (nums[l] + nums[r] < k){
                l++;
            } else if (nums[l] + nums[r] > k){
                r--;
            } else {
                cnt++;
                l++;
                r--;
            }
        }
        return cnt;
    }

    // O(n) by hashmap
    public int maxOperations(int[] nums, int k){
        Map<Integer, Integer> map = new HashMap<>();
        int cnt = 0;
        for (int i = 0; i < nums.length; i++){
            int target = k - nums[i];
            if (map.containsKey(target)){
                int n;
                if ((n = map.get(target)) == 1){
                    map.remove(target);
                } else {
                    map.put(target, n - 1);
                }
                cnt++;
            } else {
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            }
        }
        return cnt;
    }
}
