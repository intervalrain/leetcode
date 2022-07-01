package com.rainhu;

import java.util.Map;
import java.util.HashMap;

/**
 * 525. Contiguous Array (Medium)
 *
 * Given a binary array name,
 * return the maximum length of a contiguous subarray with an equal number of 0 and 1.
 *
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/2/4
 * @apiNote:
 */

public class n525_ContiguousArray{
    public int findMaxLength(int[] nums){

        Map<Integer, Integer> map = new HashMap<>();
        int curr = 0;
        int len = 0;
        for (int i = 0; i < nums.length; i++){
            curr += nums[i] == 0 ? -1 : 1;
            if (curr == 0) len = Math.max(len, i + 1);
            if (map.containsKey(curr)){
                len = Math.max(len, i - map.get(curr));
            } else {
                map.put(curr, i);
            }
        }

        return len;
    }

    /** best solution */
    public int findMaxLength2(int[] nums){
        if (nums == null || nums.length == 0) return 0;
        int sum = 0;
        int res = 0;
        Integer[] map = new Integer[nums.length * 2 + 1];
        map[nums.length] = -1;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 0)
                sum--;
            else
                sum++;
            Integer idx = map[sum + nums.length];
            if (idx != null)
                res = Math.max(res, i - idx);
            else
                map[sum + nums.length] = i;
        }   
        return res;
    }
    public static void main(String[] args){
        int[] nums = new int[]{0,0,1,0,0,0,1,1};
        // 1, 0, 0, 0, 1, 0, 1
        n525_ContiguousArray clz = new n525_ContiguousArray();
        System.out.println(clz.findMaxLength2(nums));
    }
}
