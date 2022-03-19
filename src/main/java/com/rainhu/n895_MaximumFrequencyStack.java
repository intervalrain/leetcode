package com.rainhu;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Map;
import java.util.HashMap;

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
    Map<Integer, Integer> map;
    public n895_MaximumFrequencyStack(){
        stacks = new ArrayList<>();
        map = new HashMap<>();
    }

    public void push(int val){
        Stack<Integer> st;
        if (stacks.size() < map.getOrDefault(val, 0) + 1){
            st = new Stack<>();
            stacks.add(st);
        } else
            st = stacks.get(map.getOrDefault(val, 0));
        st.push(val);
        map.put(val, map.getOrDefault(val, 0) + 1);
    }

    public int pop(){
        Stack<Integer> st = stacks.get(stacks.size() - 1);
        int top = st.pop();
        map.put(top, map.get(top) - 1);
        if (st.isEmpty()){
            stacks.remove(stacks.size() - 1);
        }
        return top;
    }
}
