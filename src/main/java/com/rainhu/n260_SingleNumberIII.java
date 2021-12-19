package com.rainhu;

// import java.util.Set;
// import java.util.HashSet;

/**
 * 238. Single Number III
 * 
 * Given an integer array nums, in which exaclty two elements appear only once,
 * and all the ohter elements appear exaclty twice. Fine the two elements that appear only once.
 * You can return the answer in any order.
 * 
 * @author: Rain Hu
 * @version: 2
 * @since: 2021/11/7
 * @apiNote: (1) hashset (2) low-bit operation(x&(-x+1))
 */

public class n260_SingleNumberIII {
    // bitwise: low-bit operation(x&(~x+1))
    public int[] singleNumber(int[] nums) {
        int x = 0;
        for (int num: nums)
            x ^= num;
        int y = x & (~x+1);
        int res[] = new int[2];
        for (int num: nums){
            if ((num & y)>=1)
                res[0] ^= num;
            else
                res[1] ^= num;
        }
        return res;

    }
    // hashset
    // public int[] singleNumber(int[] nums){
    //     Set<Integer> map = new HashSet();
    //     for (int i = 0; i<nums.length; i++){
    //         if (map.contains(nums[i])){
    //             map.remove(nums[i]);
    //         } else {
    //             map.add(nums[i]);
    //         }
    //     }
    //     int res[] = new int[2];
    //     int i = 0;
    //     for (int e:map){
    //         res[i++] = e;
    //     }
    //     return res;
    // }
}
