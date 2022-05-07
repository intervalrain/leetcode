package com.rainhu;

import java.util.Stack;

/**
 * 1209. Remove All Adjacent Duplicates in String II (Medium)
 * 
 * You are given a string s and an integer k,
 * a k duplicate removal consists of choosing k and adjacent and equal letters from s and removing them,
 * causing the left and the right side of the deleted substring to concatenate together.
 * 
 * We repeatedly make k duplicate removals on s until we no longer can.
 * 
 * Return the final string after all such duplicate removals have been made.
 * It is guaranteed the the answer is unique.
 * 
 * @author: Rain Hu
 * @version: 2
 * @since: 2022/5/6
 * @apiNote
 */

public class n1209_RemoveAllAdjacentDuplicatesInStringII {
    
    public String removeDuplicates(String s, int k) {
        char[] ch = s.toCharArray();
        int[] cnt = new int[ch.length];
        int j = 0;
        for (int i = 0; i < ch.length; i++, j++){
            ch[j] = ch[i];
            if (j > 0 &&ch[j] == ch[j-1]) {
                cnt[j] = cnt[j-1] + 1;
            } else {
                cnt[j] = 1;
            }
            if (cnt[j] == k) j -= k;
        }
        return new String(ch, 0, j);
    }


    public String removeDuplicates2(String s, int k){
        if (s.length() < k) return s;
        Stack<Stack<Character>> res = new Stack<>();
        char curr = '\0';
        for (char c : s.toCharArray()){
            if (curr != c)
                res.add(new Stack<>());
            res.peek().add(c);
            curr = c;
            if (res.peek().size() == k) {
                res.pop();
                if (res.isEmpty())
                    curr = '\0';
                else
                    curr = res.peek().peek(); 
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!res.isEmpty()){
            Stack<Character> stack = res.pop();
            while (!stack.isEmpty()){
                sb.append(stack.pop());
            }
        }
        return sb.reverse().toString();
    }
}
