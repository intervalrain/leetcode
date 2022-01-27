package com.rainhu;

import java.util.HashSet;
import java.util.Set;

/**
 * 421. Maximum XOR of Two Numbers in an Array (Medium)
 * 
 * Given an integer array nums, 
 * return the maximum result of nums[i] XOR nums[j],
 * where 0 <= i <= j < n.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/1/27
 * @apiNote: bit manipulation
 *           1. bit masking
 *           2. Greedy search based on prefix
 *           3. 2sum
 */

public class n421_MaximumXORofTwoNumbersInAnArray {
    public int findMaximumXOR(int[] nums){
        int max = 0, mask = 0;
        for (int i = 31; i >= 0; i--){
            mask = mask | (1 << i);
            Set<Integer> set = new HashSet<>();
            for (int num : nums){
                set.add(num & mask);
            }
            int tmp = max | (1 << i);
            for (int prefix : set){
                if (set.contains(tmp ^ prefix)){
                    max = tmp;
                    break;
                }
            }
        }
        return max;
    }
}


