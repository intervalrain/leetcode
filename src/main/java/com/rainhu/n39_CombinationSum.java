package com.rainhu;

import java.util.ArrayList;
import java.util.List;

/**
 * 39. Combination Sum (Medium)
 * 
 * Given an array of distinct integers candidates and a target integer target,
 * return a list of all combinations of candidates where the chosen numbers sum to target.
 * You may return the combinations in any order.
 * 
 * The same number may be chosen from candidates an unlimited number of times.
 * Two candidates are unique if the frequency of at least one of chosen numbers is different.
 * 
 * Is it guaranteed that the number of unique combinations that sum up to target is less than combination for the given input.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/2/17
 * @apiNote: backtracking
 */

public class n39_CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        combination(0, candidates, target, res, ans);
        return res;
    }

    public void combination(int i, int[] candidates, int target, List<List<Integer>> res, List<Integer> ans){
        if (i == candidates.length){
            if (target == 0){
                res.add(new ArrayList<>(ans));
            }
            return;
        }

        if (candidates[i] <= target){
            ans.add(candidates[i]);
            combination(i, candidates, target - candidates[i], res, ans);
            ans.remove(ans.size()-1);
        }
        combination(i + 1, candidates, target, res, ans);

    }
}
