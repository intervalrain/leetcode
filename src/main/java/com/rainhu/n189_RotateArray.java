package com.rainhu;

/**
 * 189. Rotate Array (Medium)
 *
 * Given an array, rotate the array to the right by k steps,
 * where k is a non-negative.
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/1/30
 * @apiNote: array
 */

public class n189_RotateArray{
    public void rotate(int[] nums, int k){
        k = k % nums.length;
        int[] res = new int[nums.length];
        System.arraycopy(nums, nums.length - k, res, 0, k);
        System.arraycopy(nums, 0, res, k, nums.length - k);
        System.arraycopy(res, 0, nums, 0, nums.length);
    }
}

