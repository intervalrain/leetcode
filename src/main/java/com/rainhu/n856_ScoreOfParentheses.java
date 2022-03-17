package com.rainhu;

import com.rainhu.Generic.Stack;

/**
 * 856. Score of Parentheses (Medium)
 * 
 * Given a balanced parentheses string s,
 * return the score of the string.
 * 
 * The score of a balanced parentheses string is based on the following rule:
 *   + "()" has score 1.
 *   + AB has score A + B, where A and B are balanced parentheses strings.
 *   + (A) has score 2 * A, where A is a balanced parentheses string.
 */

public class n856_ScoreOfParentheses {
    public int scoreOfParentheses(String s){
        Stack<Integer> stack = new Stack<>();
        int curr = 0;
        for (char c : s.toCharArray()){
            if (c == '('){
                stack.push(curr);
                curr = 0;
            } else {
                curr = stack.pop() + Math.max(curr * 2, 1);
            }
        }
        return curr;
    }
}
