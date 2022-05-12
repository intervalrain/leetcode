package com.rainhu;

import java.util.ArrayList;
import java.util.List;

/**
 * 47. PermutationII (Medium)
 * 
 * Given a collection of numbers, nums,
 * that might contain duplicates,
 * return all possible unique permutations in any order.
 * 
 * @author: Rain Hu
 * @version: 2
 * @since: 2022/5/12
 * @apiNote: backtracking
 */

public class n47_PermutationII {

    public List<List<Integer>> permuteUnique(int[] nums){
        List<List<Integer>> res = new ArrayList<>();
        permute(0, nums, res);
        return res;
    }
    private void permute(int idx, int[] nums, List<List<Integer>> res){
        boolean[] used = new boolean[20];

        if (idx == nums.length -1){
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < nums.length; i++){
                list.add(nums[i]);
            }
            res.add(list);
        }

        for (int i = idx; i < nums.length; i++){
            if (used[nums[i] + 10]) continue;
            swap(nums, i, idx);
            permute(idx + 1, nums, res);
            swap(nums, i, idx);
            used[nums[i] + 10] = true;
        }
    }
    private void swap(int[] nums, int a, int b){
        int tmp = nums[a];
        nums[a] = nums[b];
        nums[b] = tmp;
    }


    public List<List<Integer>> permuteUnique2(int[] nums){
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> can = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        traverse(nums, res, can, used);
        return res;
    }

    private void traverse(int[] nums, List<List<Integer>> res, List<Integer> can, boolean[] used){
        if (can.size() == nums.length){
            if (res.contains(can)) return;
            res.add(new ArrayList<>(can));
            return;
        }
        for (int i = 0; i < nums.length; i++){
            if (used[i]) continue;
            can.add(nums[i]);
            used[i] = true;
            traverse(nums, res, can, used);
            can.remove(can.size()-1);
            used[i] = false;
        }

    }

    public static void main(String[] args){
        n47_PermutationII clz = new n47_PermutationII();
        int[] nums = new int[]{1,1,2};
        System.out.println(clz.permuteUnique(nums));
    }
}
