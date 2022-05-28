package com.rainhu;

/**
 * 268. Missing Number (Easy)
 * 
 * Given an array nums containing n distinct numbers in the range [0, n],
 * return the only number in the range that is missing from the array.
 * 
 * @author: Rain Hu
 * @version: 2
 * @since: 2022/5/28
 * @apiNote: bit manipulation
 */

public class n268_MissingNumber {
    public int missingNumber(int[] nums){
        int n = nums.length;
        int res = n;
        for (int i = 0; i < n; i++){
            res ^= i;
            res ^= nums[i];
        }
        return res;
    }

    public int missingNumber2(int[] nums){
        int n = nums.length;
        int i = 0;
        int res = n;
        while (i < n) {
            if (nums[i] == n){
                res = i;
                i++;
            } else if (nums[i] == i){
                i++;
            } else {
                int tmp = nums[i];
                nums[i] = nums[tmp];
                nums[tmp] = tmp;
            }
        }
        return res;
    }


}
