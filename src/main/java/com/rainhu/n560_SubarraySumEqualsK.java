package com.rainhu;

import java.util.Map;
import java.util.HashMap;

/**
 * 560. Subarray Sum Equals K (Medium)
 * 
 * Given an array of integers nums and an integer k,
 * return the total number of continuous subarrays whose sum equals to k.
 * 
 * For example, nums = {1,2,1,2,0,0,0,0,1}, k = 3;
 * The answer to the question is 8, 
 * which 4 sub arrays are [1,2], [2,1], [1,2], [1,2,0], [1,2,0,0], [1,2,0,0,0], [1,2,0,0,0,0], [2,0,0,0,0,1]
 * 
 * 
 * [0: 1   +1
 *  1: 1   +1
 *  3: 1   +1 + 1 + 1 + 1 + 1
 *  4: 1   +1
 *  6: 5
 *  7: 1
 * ]
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/2/10
 * @apiNote: HashMap 
 */

public class n560_SubarraySumEqualsK {
    
    public int subarraySum(int[] nums, int k){
        int cnt = 0, sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int i = 0; i < nums.length; i++){
            sum += nums[i];
            if (map.containsKey(sum - k)){
                cnt += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return cnt;
    }
    public static void main(String[] args){
        n560_SubarraySumEqualsK clz = new n560_SubarraySumEqualsK();
        int[] nums = new int[]{1,2,1,2,0,0,0,0,1};
        System.out.println(clz.subarraySum(nums, 3));
    }

}
