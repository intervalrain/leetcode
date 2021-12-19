package com.rainhu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 386. Largest Divisible Subset (Medium)
 * 
 * Given a set of distinct positive integers nums,
 * return the largest subset answer such that every pair (answer[i], answer[j]) of elements in this subset satisfies:
 *     answer[i] % answer[j] == 0 or
 *     answer[j] % answer[i] == 0
 * If there are multiple solutions, return any of them.
 * 
 * @author: Rain Hu
 * @version: 
 * @since: 
 * @apiNote:
 * 
 */
public class n386_LargestDivisibleSubset{
    int[] maxlen;  // whether got visited if yes store its max length
    int[] path;    // remember the path of max length trace
    int len;
    public List<Integer> largestDivisibleSubset(int[] nums){
        List<Integer> ret = new ArrayList<>();
        if (nums == null || nums.length == 0) return ret;
        len = nums.length;
        if (len == 1){
            ret.add(nums[0]);
            return ret;
        }
        maxlen = new int[len];
        path = new int[len];
        int max = 0;
        int idx = -1;
        Arrays.sort(nums);
        for (int i=0; i<len; i++){
            int temp = helper(i, nums);
            if (temp > max){
                max = temp;
                idx = i;
            }
        }
        while (idx != path[idx]){
            ret.add(nums[idx]);
            idx = path[idx];
        }
        ret.add(nums[idx]);
        return ret;
    }

    public int helper(int curr, int[] nums){
        if (curr > len) return 0;
        if (maxlen[curr] > 0) return maxlen[curr];
        path[curr] = curr;
        int currMax = 0;
        long currVal = (long)nums[curr];
        long i = 2;
        long next = currVal * i;
        int nid = curr + 1;

        while (next <= nums[len-1] && nid < len){
            if (nums[nid] < next){
                nid = Arrays.binarySearch(nums, nid+1, len, (int)next);
                if (nid < 0) nid = -(nid+1);
            } else {
                if (nums[nid] % nums[curr] == 0){
                    int temp = helper(nid, nums);
                    if (temp > currMax){
                        currMax = temp;
                        path[curr] = nid;
                    }
                }
                i = nums[nid] / nums[curr] + 1;
                next = currVal * i;
            }
        }
        maxlen[curr] = currMax + 1;
        return maxlen[curr];
    }
}