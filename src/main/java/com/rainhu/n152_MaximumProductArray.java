package com.rainhu;

/**
 * 152. Maximum Product Subarray
 * 
 * Given an integer array nums,
 * find a contiguous non-empty subarray within the array that has the largest product,
 * and return the product.
 * 
 * it is guaranteed that the answer will fir in 1 32-bit integer.
 * 
 * A subarray is a contiguous subsequence of the array.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2021/12/3
 * @apiNote
 */

public class n152_MaximumProductArray {
    public int maxProduct(int[] A) {
        int max = Integer.MIN_VALUE;
        int prod = 1;
        for (int i = 0; i < A.length; i++){
            prod *= A[i];
            max = Math.max(prod, max);
            if (prod == 0) prod = 1;
        }
        prod = 1;
        for (int i = A.length-1; i >= 0; i--){
            prod *= A[i];
            max = Math.max(prod, max);
            if (prod == 0) prod = 1;
        }
        return max;
    }
}

        // if (A == null || A.length == 0) {
        //     return 0;
        // }
        // int max = A[0], min = A[0], result = A[0];
        // for (int i = 1; i < A.length; i++) {
        //     int temp = max;
        //     max = Math.max(Math.max(max * A[i], min * A[i]), A[i]);
        //     min = Math.min(Math.min(temp * A[i], min * A[i]), A[i]);
        //     if (max > result) {
        //         result = max;
        //     }
        // }
        // return result;