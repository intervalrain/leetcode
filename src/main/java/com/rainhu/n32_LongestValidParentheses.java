package com.rainhu;

/**
 * 32. Longest Valid Parentheses (Hard)
 * 
 * Given a string containing just the characters '(' and ')',
 * find the length of the longest valid (well-formed) parentheses substring.
 */

public class n32_LongestValidParentheses {
    public int longestValidParentheses(String s){
        int len = s.length();
        int left = 0;
        int right = 0;
        int max = 0;

        /**
         * (())(()
         * ----x--
         */

        for (int i = 0; i < len; i++){
            if (s.charAt(i) == '(')
                left++;
            else right++;
                
            if (left == right)
                max = Math.max(max, 2 * left);
            else if (right > left)
                right = left = 0;
        }
        
        right = left = 0;
        for (int i = len-1; i >= 0; i--){
            if (s.charAt(i) == '(')
                left++;
            else right++;

            if (left == right)
                max = Math.max(max, 2 * left);
            else if (left > right)
                right = left = 0;
        }
        return max;
    }
}
