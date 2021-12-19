package com.rainhu;

import java.util.Arrays;

/**
 * 238. Product of Array Except Self (Medium)
 * 
 * Given an integer array nums,
 * return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
 * 
 * The product of any prefix or suffix of nums is guaranted to fit in a 32-bit integer.
 * 
 * You must write an algorithm that runs in O(n) time and without using the division operation.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2021/11/27
 * @apiNote: 
 * 
 */

public class n238_ProductOfArrayExceptSelf {

    // nums = [a, b,  c ,   d  ]
    // ans  = [1, a, a*b, a*b*c]
    // ans  = [b*c*d, a*c*d, a*b*d, a*b*c]
    public int[] productExceptSelf(int[] nums){
        int len = nums.length;
        int[] ans = new int[len];

        ans[0] = 1;
        for (int i = 1; i < len; i++){
            ans[i] = ans[i-1] * nums[i-1];
        }
        int right = 1;
        for (int i = len-1; i >= 0; i--){
            ans[i] *= right;
            right *= nums[i];
        }
        return ans;
    }


    public int[] productExceptSelf2(int[] nums){
        int[] dp = new int[nums.length];
        int prod = 1;
        int cnt = 0;
        for (int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                dp[i]++;
                cnt++;
            } else {
                prod *= nums[i];
            }
        }
        
        

        if (cnt > 0){
            if (cnt > 1){
                int[] res = new int[nums.length];    
                Arrays.fill(res, 0);
                return res;
            }
            for (int i = 0; i < nums.length; i++)
                if (dp[i] > 0)
                    nums[i] = prod;
                else
                    nums[i] = 0;
        } else {
            for (int i = 0; i < nums.length; i++)
               nums[i] = prod/nums[i];
        }
        return nums;
    }
}
