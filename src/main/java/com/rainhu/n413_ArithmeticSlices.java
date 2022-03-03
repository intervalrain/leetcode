package com.rainhu;

import java.util.ArrayList;
import java.util.List;

/**
 * 413. Arithmetic Slices (Medium)
 * 
 * An integer array is called arithmetic if it consists of at least three elements and if the difference between any two consecutive elements is the same.
 *   + For example, [1,3,5,7,9], [7,7,7,7], and [3,-1,-5,-9] are arithmetic sequences.
 * Given an integer array nums, return the number of arithmetic subarrays of nums.
 * 
 * A subarray is a contiguous subsequence of the array.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/3/4
 * @apiNote: 
 */

public class n413_ArithmeticSlices {
    public int numberOfArithmeticSlices(int[] nums){
        if (nums.length < 3)
            return 0;
        List<Integer> list = new ArrayList<>();
        int sp = nums[1] - nums[0];
        int cnt = 2;
        for (int i = 2; i < nums.length; i++){
            int curr = nums[i] - nums[i-1];
            if (curr == sp){
                cnt++;
            } else {
                if (cnt >= 3) 
                    list.add(cnt);
                cnt = 2;
                sp = curr;
            }
        }
        if (cnt >= 3) 
            list.add(cnt);
        int total = 0;
        for (int i = 0; i < list.size(); i++){
            total += cal(list.get(i));
        }
        return total;
    }
    int cal(int n){
        int a = n - 2;
        return (a+1)*a/2;
    }
}
