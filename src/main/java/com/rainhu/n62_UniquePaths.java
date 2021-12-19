package com.rainhu;

/**
 * 62. Unique Paths (Medium)
 * 
 * A robot is located at th top-left corner of a m x n grid(marked 'Start' in the diagram below).
 * 
 * The robot can only move either down or right at any point in time.
 * The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).
 * 
 * How many possible unique paths are there?
 * 
 * @author: Rain Hu
 * @version: 2
 * @since: 2021/11/18
 * @apiNote: (1)Dynamic Programming (2)Permutation and combinations
 */

public class n62_UniquePaths {
    public int uniquePaths(int m, int n){
        int[][] dp = new int[m+1][n+1];
        for (int i = 1; i <= m; i++)
            dp[i][1] = 1;
        for (int i = 1; i <= n; i++)
            dp[1][i] = 1;
        for (int i = 2; i <= m; i++){
            for (int j = 2; j<=n; j++){
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        return dp[m][n];
    }
}


/**
 * dynamic programming
 * 
 * m = 3, n = 7
 * -----------------------------
 * | 1 | 1 | 1 | 1 | 1 | 1 | 1 |
 * -----------------------------
 * | 1 | 2 | 3 | 4 | 5 | 6 | 7 |
 * -----------------------------
 * | 1 | 3 | 6 | 10| 15| 21| 28|
 * -----------------------------
 */


