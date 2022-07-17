package com.rainhu;

/**
 * 152. Maximum Product Subarray (Medium)
 * 
 * Given an integer array nums,
 * find a contiguous non-empty subarray within the array that has the largest product,
 * and return the product.
 * 
 * The test cases are generated so that the answer will be fit in a 32-bit integer.
 * 
 * A subarray is a contiguous subsequence of the array.
 * 
 * @author: Rain Hu
 * @version: 2
 * @since: 2022/7/15
 * @apiNote: array
 */

public class n151_MaximumProductSubarray {
    public int maxProduct(int[] nums){
        int res = Integer.MIN_VALUE;
        int curr = 1;
        int n = nums.length;
        int neg = 0;
        for (int i = 0; i < n; i++){
            curr *= nums[i];
            res = Math.max(res, curr);
                
            if (curr == 0){
                curr = 1;
                neg = 0;
            } else if (curr < 0){
                if (neg == 0){
                    neg = curr;
                } else {
                    res = Math.max(res, curr/neg);
                }
            }
        }
        return res;
    }


    public int maxProduct2(int[] nums){
        if (nums == null || nums.length == 0) return 0;
        int max = Integer.MIN_VALUE;
        int prod = 1;
        for (int i = 0; i < nums.length; i++){
            prod *= nums[i];
            max = Math.max(max, prod);
            if (prod == 0) prod = 1;
        }
        prod = 1;
        for (int i = nums.length - 1; i >= 0; i--){
            prod *= nums[i];
            max = Math.max(max, prod);
            if (prod == 0) prod = 1;
        }
        return max;
    }
}
