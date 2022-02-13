package com.rainhu;

import java.util.ArrayList;
import java.util.List;

/**
 * 78. Subset (Medium)
 * 
 * Given an integer array nums of unique elements,
 * return all possible subsets (the power set).
 * 
 * The solution set must not contain duplicate subsets.
 * Return the solution in any order.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/2/13
 * @apiNote: 
 */

public class n78_Subsets {
    public List<List<Integer>> subsets(int[] nums){
        List<List<Integer>> res = new ArrayList<>();
        extend(nums, 0, res, new ArrayList<Integer>());
        return res;
    }
    private void extend(int[] nums, int pos, List<List<Integer>> list, List<Integer> a){
        if (pos == nums.length){
            list.add(a);
            return;
        }
        List<Integer> b = new ArrayList<>(a);
        List<Integer> c = new ArrayList<>(a);
        c.add(nums[pos]);
        extend(nums, pos + 1, list, b);
        extend(nums, pos + 1, list, c);
    }
}
