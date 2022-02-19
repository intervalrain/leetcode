package com.rainhu;

import java.util.Stack;

/**
 * 402. Remove K Digits (Medium)
 * 
 * Given string num representing a non-negative integer num,
 * and ad integer k,
 * return the smallest possible integer after removing k digits from num.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/2/18
 * @apiNote
 */

public class n402_RemoveKDigits {
    public String removeKdigits(String num, int k){
        if (num.length() == k)
            return "0";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < num.length(); i++){
            char c = num.charAt(i);
            while (!stack.empty() && k > 0 && stack.peek() > c){
                stack.pop();
                k--;
            }
            stack.push(c);
        }
        while (k > 0){
            stack.pop();
            k--;
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()){
            sb.append(stack.pop());
        }
        sb.reverse();
        int i = 0;
        while (sb.charAt(i) == '0' && i < sb.length() - 1){
            i++;
        }

        return sb.toString().substring(i, sb.length());
    }
}
