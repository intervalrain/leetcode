package com.rainhu;

import java.util.ArrayList;
import java.util.List;

/**
 * 131. Palindrome Partitioning (Medium)
 * 
 * Given a string s, partiton s such that every substring of the partition is a palindrome.
 * Return all possible palindrome partitioning of s.
 * 
 * A palindrome string is a string that reads the same backward as forward.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/1/5
 * @apiNote
 */

public class n131_PalindromePartitioing {
    public List<List<String>> partition(String s){
        List<List<String>> res = new ArrayList<>();
        List<String> list = new ArrayList<>();
        int n = s.length();
        String[][] dp = new String[n][n];
        dfs(s, 0, list, res, dp);
        return res;
    }

    private void dfs(String s, int pos, List<String> list, List<List<String>> res, String[][] dp){
        if (pos == s.length())
            res.add(new ArrayList<>(list));
        else {
            for (int i = pos; i < s.length(); i++){
                if (dp[pos][i] != null){
                    list.add(dp[pos][i]);
                    dfs(s, i+1, list, res, dp);
                    dp[pos][i] = list.remove(list.size() - 1);
                } else if (isPal(s, pos, i)){
                    list.add(s.substring(pos, i + 1));
                    dfs(s, i+1, list, res, dp);
                    dp[pos][i] = list.remove(list.size() - 1);
                }
            }
        }

    }

    private boolean isPal(String s, int low, int high){
        while (low < high){
            if (s.charAt(low++) != s.charAt(high--))
                return false;
        }
        return true;
    }
}
