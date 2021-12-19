package com.rainhu;

/**
 * 96. Unique Binary Search Trees (Medium)
 * 
 * Given an integer n, return the number of structurally unique BST's(binary search trees)
 * which has exactly n nodes of unique values from 1 to n.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2021/11/8
 * @apiNote: Catalan Sequence
 */

public class n96_UniqueBinarySearchTrees {
    public int numTrees(int n){
        int[] dp = new int[n+1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                dp[i] += dp[i-j]*dp[j-1];
            }
        }
        return dp[n];
    }
}


/**
 * dp[0] = 1
 * dp[1] = 1
 * dp[2] = dp[1] + dp[1] = 2
 * dp[3] = dp[2] + dp[1] + dp[2] = 5
 * dp[4] = dp[3] + dp[2]dp[1] + dp[1]dp[2] + dp[3] = 14
 * dp[5] = dp[4] + dp[3]dp[1] + dp[2]dp[2] + dp[1]dp[3] + dp[4] = 42
 * ...
 * dp[n] = dp[n-1]dp[0] + dp[n-2]dp[1] + ... + dp[1]dp[n-2] + dp[0]dp[n-1]
 * 
 * F(i, n) = G(i-1) * G(n-i)
 */
