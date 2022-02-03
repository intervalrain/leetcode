package com.rainhu;

import java.util.Map;
import java.util.HashMap;

/** 454. 4Sum II (Medium)
 *
 * Given four integer arrays nums1, nums2, nums3, and nums4
 * all of length n, return the number of tuples (i, j, k, l) such that:
 *     + 0 <= i, j, k, l < n
 *     nums1[i] + nums2[j] + nums3[k] + nums4[l] == 0
 */

public class n454_4SumII{
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4){
        int n = nums1.length;
        int cnt = 0;

        Map<Integer, Integer> map = new HashMap<>(n * n); // to set initial capacity bigger to prevent resize too frequently.
        for (int num1: nums1){
            for (int num2: nums2){
                map.put(num1 + num2, map.getOrDefault(num1 + num2, 0) + 1);
            }
        }

        for (int num3: nums3){
            for (int num4: nums4){
                cnt += map.getOrDefault(-(num3 + num4), 0);
            }
        }

        return cnt;
    }
}
