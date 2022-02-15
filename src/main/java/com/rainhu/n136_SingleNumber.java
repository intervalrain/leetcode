package com.rainhu;

/**
 * 136. Single Number (Easy)
 * 
 * Given a non-empty array of integers nums,
 * every element appears twice except for one.
 * Find that single one.
 * 
 * You must implement a solution with a linear runtime complexity and use only constant extra space.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/2/15
 * @apiNote: bitwise calculation: XOR
 */

public class n136_SingleNumber {
    public int singleNumber(int[] nums){
        int res = 0;
        for (int num:nums)
            res ^= num;
        return res;
    }
}
