package com.rainhu;

import java.util.HashMap;
import java.util.Map;

/**
 * 532. Given an array of integers nums and an integer k,
 * return the number of unique k-diff pairs in the array.
 * 
 * A k-diff pair is an integer pair (nums[i], nums[j]),
 * where the following are true:
 *   + 0 <= i < j < nums.length;
 *   + |nums[i] - nums[j]| == k
 * Notice that |val| donotes the absolute value of val.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/2/10
 * @apiNote: HashMap
 */

public class n532_KdiffPairsInAnArray {
    public int findPairs(int[] nums, int k){        
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int cnt = 0;        

        if (k == 0){
            for (int key : map.keySet()){
                if (map.containsKey(key) && map.get(key) > 1)
                    cnt++;
            }
        } else {
            for (int key : map.keySet()){
                if (map.containsKey(key - k))
                    cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args){
        int[] nums = new int[]{1,2,3,4,5};
        int k = 1;
        System.out.println(new n532_KdiffPairsInAnArray().findPairs(nums, k));
    }
}
