package com.rainhu;

import java.util.Stack;

/**
 * 946. Validate Stack Sequences (Medium)
 * 
 * Given two integer arrays pushed and popped each with distinct values,
 * return true if this could have been the result of a sequence of push and pop operations on initially empty stack,
 * or false otherwise.
 * 
 * @author: Rain Hu
 * @version: 2
 * @since: 2022/3/17
 * @apiNote: Stack
 */

public class n946_ValidateStackSequences {
    // best solution
    public boolean validateStackSequences(int[] pushed, int[] popped){
        int n = pushed.length;
        if (n == 0) return true;
        int j = 0;
        int i = -1;
        for (int p : pushed){
            pushed[++i] = p;
            while (i >= 0 && pushed[i] == popped[j]){
                i--;
                j++;
            }
        }
        if (i == -1 && j == n) return true;
        return false;
    }
    
    // version 1
    public boolean validateStackSequences1(int[] pushed, int[] popped){
        Stack<Integer> stack = new Stack<>();
        int n = pushed.length;
        int idx = 0;
        for (int i = 0; i < n; i++){
            stack.push(pushed[i]);
            while (!stack.isEmpty() && stack.peek() == popped[idx]){
                idx++;
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
