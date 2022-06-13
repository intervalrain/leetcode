package com.rainhu;

import java.util.List;

/**
 * 120. Triangle (Medium)
 * 
 * Given a triangle array, return the minimum path sum from top to bottom.
 * 
 * For each step, you may move to an adjacent number of row below.
 * More formally, if you are on index i on the current row,
 * you may move to either index i or index i + 1 on the next row.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/6/14
 * @apiNote: dynamic programming
 */

public class n120_Triangle {
    public int minimumTotal(List<List<Integer>> triangle){
        int n = triangle.size();
        int[][] dp = new int[n][n];

        dp[0][0] = triangle.get(0).get(0);
        int res = Integer.MAX_VALUE;

        for (int row = 1; row < n; row++){
            dp[row][0] = triangle.get(row).get(0) + dp[row-1][0];
            dp[row][row] = triangle.get(row).get(row) + dp[row-1][row-1];
            for (int col = 1; col < row; col++){
                int left = triangle.get(row).get(col) + dp[row-1][col-1];
                int right = triangle.get(row).get(col) + dp[row-1][col];
                dp[row][col] = Math.min(left, right);
            }
        }

        for (int col = 0; col < n; col++){
            res = Math.min(res, dp[n-1][col]);
        }

        return res;
    }
}
