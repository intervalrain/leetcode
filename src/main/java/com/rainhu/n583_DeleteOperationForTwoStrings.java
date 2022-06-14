package com.rainhu;

/**
 * 583. Delete Operation for Two Strings (Medium)
 * 
 * Given two strings word1 and word2,
 * return the minimum number of steps required to make word1 and word2 the same.
 * 
 * In one step, you can delete exactly one character in either string.
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/6/14
 * @apiNote: dynamic programming
 */

public class n583_DeleteOperationForTwoStrings {
    public int minDistance(String word1, String word2){
        int dp[][] = new int[word1.length()+1][word2.length()+1];
        for (int i = 1; i <= word1.length(); i++){
            for (int j = 1; j <= word2.length(); j++){
                if (word1.charAt(i-1) == word2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1; 
                } else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return word1.length() + word2.length() - dp[word1.length()][word2.length()] * 2;
    }
}
