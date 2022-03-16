package com.rainhu;

/**
 * 1249. Minimum Remove to Make Valid Parentheses (Medium)
 * 
 * Given a string s of '(', ')' and lowercase English characters.
 * 
 * Your task is to remove the minimum number of parentheses ('(', ')'), in any positions)
 * so that the resulting parentheses string is valid and return anu valid string.
 * 
 * Formally, a parentheses string is valid if and only if:
 *   + It is empty string, contains only lowercase characters, or
 *   + It can be written as AB ( A concatenated with B), where A and B are valid srings or
 *   + It can be written as (A), where A is a valid string.
 * 
 * @author: Rain Hu
 * @version: 2
 * @since: 2022/3/16
 * @apiNote: Use replace isolated parentheses and then skip the isolated parentheses.
 */

public class n1249_MinimumRemoveToMakeValidParentheses {
    
    // best solution
    public String minRemoveToMakeValid(String s){
        char[] arr = s.toCharArray();
        int open = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == '(')
                open++;
            else if (arr[i] == ')'){
                if (open == 0) arr[i] = '*';
                else open--;
            }
        }
        for (int i = arr.length - 1; i >= 0; i--){
            if (open > 0 && arr[i] == '('){
                arr[i] = '*';
                open--;
            }
        }

        int p = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] != '*') arr[p++] = arr[i];
        }
        return new String(arr).substring(0, p);
    }

    // 1st version
    public String minRemoveToMakeValid1(String s){
        int curr = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if (ch == '('){
                curr++;
                sb.append(ch);
            } else if (ch == ')'){
                if (curr > 0){
                    curr--;
                    sb.append(ch);
                }
            } else {
                sb.append(ch);
            }
        }
        if (curr == 0) return sb.toString();
        String res = sb.toString();
        while (curr > 0){
            int idx = res.lastIndexOf("(");
            res = res.substring(0, idx) + res.substring(idx+1, res.length());
            curr--;
        }
        return res;
    }
}
