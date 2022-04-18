package com.rainhu;

import java.util.List;
import java.util.Map;
import java.util.HashMap;


import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;

/**
 * 40. Combination Sum II (Medium)
 * Given a collection of candidate numbers (candidates) and a target number (target),
 * find all unique combinations in candidates where the candidate numbers sum to target.
 * 
 * Each number in candidates may only be used once in the combination.
 * 
 * Note: The solution set must not contain duplicate combinations.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/4/17
 * @apiNote: 
 */

public class n40_CombinationSumII {
    
    /**
     * pseudo code:
     * 
     * 1. sort the array
     * 2. pick up the n element, new target = target - arr[n].
     * 3. if there is element == new target, add to the final result.
     * 3. check the array if any element <= new target exists
     *      if there is element < new target, add to the tmp list, and check from the current element's position.
     *      if there is no element <= new target, pop out the n element, return old target and the move on to next index(n-1)
     *      
     */

    
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> path = new ArrayList<Integer>();
        dfs(candidates, 0, target, path, res);
        return res;
    }
    void dfs(int[] candidates, int cur, int target, List<Integer> path, List<List<Integer>> res) {
        if (target == 0) {
            res.add(new ArrayList(path));
            return ;
        }
        if (target < 0) return;
        for (int i = cur; i < candidates.length; i++){
            if (i > cur && candidates[i] == candidates[i-1]) continue;
            path.add(candidates[i]);
            dfs(candidates, i+1, target - candidates[i], path, res);
            path.remove(path.size()-1);
        }
    }
}
