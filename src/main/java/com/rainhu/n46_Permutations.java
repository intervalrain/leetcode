package com.rainhu;

import java.util.List;
import java.util.ArrayList;

/**
 * 46. Permutations (Medium)
 * 
 * Given an array nums of distinct integers,
 * return all the possible permutations.
 * You can return the answer in any order.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2021/12/22
 * @apiNote
 */

public class n46_Permutations{
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums){
        perm(nums, 0);
        return res;
    }

    private void perm(int[] nums, int start){
        if (start == nums.length){
            List<Integer> list = new ArrayList<>();
            for (int num : nums)
                list.add(num);
            res.add(list);
            return;
        }

        for (int i = start; i < nums.length; i++){
            swap(start, i, nums);
            perm(nums, start+1);
            swap(start, i, nums);
        }
    }

    private void swap(int a, int b, int[] nums){
        int tmp = nums[a];
        nums[a] = nums[b];
        nums[b] = tmp;
    }
}