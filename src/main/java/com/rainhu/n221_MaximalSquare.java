package com.rainhu;

/**
 * 221. Maximal Square (Medium)
 * 
 * Given an m x n binary matrix filled with 0's and 1's,
 * find the largest square containing only 1's and return its area.
 * 
 * @author: Rain Hu
 * @version:１
 * @since: 2021/12/18
 * @apiNote: dp
 */

public class n221_MaximalSquare {
    
    Integer[][] dp;
    int rows, cols;
    int max;
    
    public int maximalSquare(char[][] matrix){
        if (matrix == null) return 0;

        rows = matrix.length;
        cols = matrix[0].length;

        dp = new Integer[rows][cols];

        min(matrix, 0, 0);

        return max * max;
    }

    private int min(char[][] matrix, int row, int col){
        if (row >= rows || col >= cols) return 0;

        Integer cached = dp[row][col];
        if (cached != null) return cached;

        int min = Math.min(min(matrix, row+1, col), Math.min(min(matrix, row, col+1), min(matrix, row+1, col+1)));
        int res = 0;
        if (matrix[row][col] == '1') res = 1 + min;

        dp[row][col] = res;
        max = Math.max(max, res);
        return res;
    }

}
