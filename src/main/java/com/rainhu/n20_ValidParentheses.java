package com.rainhu;

import java.util.Stack;

/**
 * 20. Valid Parentheses (Easy)
 * 
 * Given as string s containing just the characters '(', ')', '{', '}', '[', ']', 
 * determine if the input string is valid.
 * 
 * An input string is valid if:
 *  1. Open brackets must be closed by the same types of brackets.
 *  2. Open brackets must be cloesd in the correct order.
 */

public class n20_ValidParentheses {

    // ASCII table
    //
    // '(': 40
    // ')': 41
    // '[': 91
    // ']': 93
    // '{': 123
    // '}': 125

    public static boolean isValid(String s){
        Stack<Character> st = new Stack<>();

        for(int i=0; i<s.length(); i++){
            if(!st.isEmpty()){
                if(st.lastElement()+1==s.charAt(i) || st.lastElement()+2==s.charAt(i))
                    st.pop();
                else if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[')
                    st.push(s.charAt(i));
                else
                    return false;
            } else if(s.charAt(i)==')' || s.charAt(i)=='}' || s.charAt(i)==']'){
                return false;
            } else {
                st.push(s.charAt(i));
            }
        }

        return st.isEmpty();
    }    
}
