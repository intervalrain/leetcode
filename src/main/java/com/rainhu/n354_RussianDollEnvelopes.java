package com.rainhu;

import java.util.Arrays;

/**
 * 354. Russian Doll Envelopes (Hard)
 * 
 * You are given a 2D array of integers envelopes where envelopes[i] = [wi, hi] represents the width and the height of an envelope.
 * 
 * One envelope can fit into another if and only if both the width and height of one envelope are greater than the other envelope's width and height.
 * 
 * Return the maximum number of envelopes you can Russian doll (i.e., put one inside the other).
 * 
 * Note: You cannot rotate an envelope.
 * 
 * @author: Rain Hu
 * @version: 2
 * @since: 2022/5/25
 * @apiNote: binary search
 */

public class n354_RussianDollEnvelopes {
    public int maxEnvelopes(int[][] envelopes){
        if (envelopes == null || envelopes.length == 0 || envelopes[0] == null || envelopes[0].length != 2) return 0;
        int n = envelopes.length;
        Arrays.sort(envelopes, (a, b) -> a[0] == b[0] ? b[1] - a[1] : a[0] - b[0]);
        int[] dp = new int[n];
        int res = 0;  
        for (int[] env : envelopes){
            // int index = Arrays.binarySearch(dp, 0, res, env[1]);
            // if (index < 0)
            //     index = -(index + 1);
            // dp[index] = env[1];
            // if (index == res)
            //     res++;
            int left = 0, right = res, mid = 0;
            while (left < right){
                mid = left + (right - left)/2;
                if (dp[mid] < env[1])
                    left = mid + 1;
                else
                    right = mid;
            }
            dp[left] = env[1];
            if (left == res) res++;
        }
        return res;
    }
}
