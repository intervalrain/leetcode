package com.rainhu;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 895. Maximum Frequency Stack (Hard)
 * 
 * Design a stack-like data structure to push elements to the stack and pop the most frequent element from the stack.
 * 
 * Implement thew FreqStack class:
 *     + FreqStack() constructes an empty frequency stack.
 *     + void push(int val) pushed an integer val onto the top of the stac.
 *     + int pop() removes and returns the most frequent element in the stack.
 *         + If there is a tie for the most frequent element, the element closest to the stack's top is removed and returned.
 * 
 * @author: Rain Hu
 * @version: 2
 * @since: 2022/3/19
 * @apiNote: Stack
 */

public class n895_MaximumFrequencyStack {
    
    List<Stack<Integer>> stacks;

    // Constructor
    public n895_MaximumFrequencyStack(){
        stacks = new ArrayList<>();
    }

    // Methods
    public void push(int val){
        push(val, 0);
    }

    private void push(int val, int freq){
        // 當 stacks[freq] 是空的時候，則新建一個 stack。
        Stack<Integer> stack;
        if (freq >= stacks.size()){
            stack = new Stack<>();
            stacks.add(stack);
        } else {
            stack = stacks.get(freq);
        }
        // 當該 stacks[freq] 已經有該元素，則往下一個 stacks 找
        if (stack.contains(val)){
            push(val, freq + 1);
        } else {
            stack.push(val);
        }
    }

    public int pop(){
        // 直接找到最高的 stack，然後把頂端的元素 pop 出。
        Stack<Integer> stack = stacks.get(stacks.size() - 1);
        int top = stack.pop();
        if (stack.isEmpty()){
            stacks.remove(stacks.size() - 1);
        }
        return top;
    }
}
