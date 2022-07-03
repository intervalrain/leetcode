package com.rainhu;

import java.util.Stack;

/**
 * 376. Wiggle Subsequence (Medium)
 * 
 * A wiggle sequence is a sequence where the differences between successive numbers strictly alternate between positive and negative.
 * The first difference (if one exists) may be either positive and negative.
 * A sequence with one element and a sequence with two non-equal elements are trivially wiggle sequences.
 * 
 *      + For example, [1, 7, 4, 9, 2, 5] is a wiggle sequence because the differences 
 *                        (6,-3, 5,-7, 3) alternate between positive and negative.
 *      + In contrast, [1, 4, 7, 2, 5] and [1, 7, 4, 5, 5] are not wiggle sequences. 
 *        The first is not because its first two differences are positive, 
 *        and the second is not because its last difference is zero.
 * 
 * A subsequence is obtained by deleting some elements (possibly zero) from the original sequence, 
 * leaving the remaining elements in their original order.
 * Given an integer array nums, return the length of the longest wiggle subsequence of nums.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/7/3
 * @apiNote: Stack
 */

public class n376_WiggleSubsequence {
    public int wiggleMaxLength(int[] nums){
        int n = nums.length;
        if (n == 1) return 1;
        Stack<Boolean> st = new Stack<>();
        int i = 1;
        while (i < n){
            boolean diff = nums[i] > nums[i-1];
            if (st.isEmpty() && nums[i] != nums[i-1]){
                st.push(diff);
            } else if (nums[i] == nums[i-1] || st.peek() == diff) {
                i++;
            } else {
                st.push(diff);
            }
        }
        return st.size() + 1;
    }
}
