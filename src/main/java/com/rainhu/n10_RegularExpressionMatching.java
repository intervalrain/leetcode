package com.rainhu;

/**
 * 10. Regular Expression Matching (Hard)
 * 
 * Given an input string s and a pattern p,
 * implement regular expression matching with support for '.' and '*' where
 * '.' matches any single chararcter.
 * '*' matches zero or more of the preceding element.
 * The matchin should cover the entire input stinrg (not partial).
 * 
 * @author: Rain Hu
 * @version: 2
 * @since: 2022/8/16
 * @apiNote: dp, dfs
 */

public class n10_RegularExpressionMatching {

    // dfs
    public boolean isMatch2(String s, String p){
        if (p.length() == 0) return s.length() == 0;

        boolean firstMatch = s.length() > 0 && (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.');

        if (p.length() >= 2 && p.charAt(1) == '*'){
            return isMatch2(s, p.substring(2)) || (firstMatch && isMatch(s.substring(1), p));
        } else {
            return firstMatch && isMatch2(s.substring(1), p.substring(1));
        }
    }

    // dp
    public boolean isMatch(String s, String p){
        int m = s.length();
        int n = p.length();
        if(m==0 || n==0)
            return false;

        // create a boolean matrix for dynamic programming
        boolean[][] dp = new boolean[m+1][n+1];
        
        // initialization
        dp[0][0] = true;
        for(int j=2; j<=n; j++){
            if(p.charAt(j-1)=='*')
            dp[0][j] = dp[0][j-2];
        }

        for(int i=1; i<=m; i++){
            for(int j=1; j<=n; j++){
                if(s.charAt(i-1)==p.charAt(j-1) || p.charAt(j-1) == '.'){
                    dp[i][j] = dp[i-1][j-1];
                } else if(p.charAt(j-1) == '*'){
                    if(dp[i][j-2]){
                        dp[i][j] = true;
                    } else if(s.charAt(i-1) == p.charAt(j-2) || p.charAt(j-2) == '.'){
                        dp[i][j] = dp[i-1][j];
                    }
                }
            }
        }
        return dp[m][n];
    }
}