package com.rainhu;

import java.util.Map;
import java.util.HashMap;

/**
 * 128. Longest Consecutive Sequence (Medium)
 * 
 * Given an unsorted array of integers nums,
 * return the length of the longest consecutive elements sequence.
 * 
 * You must write an algorithm that runs in O(n) time.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/07/05
 * @apiNote: 
 */

public class n128_LongestConsecutiveSequnce {
    public int longestConsecutive(int[] nums){
        int res = 0;
        Map<Integer, int[]> map = new HashMap<Integer, int[]>();
        for (int i = 0; i < nums.length; i++){
            int a = nums[i];
            if (map.containsKey(a)) continue;
            int left = map.containsKey(a-1) ? map.get(a-1)[0] : a;
            int right = map.containsKey(a+1) ? map.get(a+1)[1] : a;
            res = Math.max(right - left + 1, res);

            map.put(left, new int[]{left, right});
            // map.put(a, new int[]{left, right});
            map.put(right, new int[]{left, right});
        }
        return res;
    }
    
}
