package com.rainhu;

import java.util.List;
import java.util.ArrayList;

/**
 * 22. Generate Parentheses (Medium)
 * 
 * Given n pairs of parentheses,
 * write a function to generate all combinations of well-formed parentheses.
 */

public class n22_GenerateParentheses {

    public List<String> generateParenthesis(int n){
        List<String> lst = new ArrayList<>();
        dfs(new StringBuilder(), n, n, lst);
        return lst;
    }

    private void dfs(StringBuilder prefix, int left, int right, List<String> list){
        if(left==0 && right==0){
            list.add(prefix.toString());
            return;
        }
        if(left<right){
            prefix.append(")");
            dfs(prefix, left, right-1, list);
            prefix.deleteCharAt(prefix.length()-1);
        }
        if(left>0){
            prefix.append("(");
            dfs(prefix, left-1, right, list);
            prefix.deleteCharAt(prefix.length()-1);
        }
            
    }
}
