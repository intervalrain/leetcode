package com.rainhu;

import java.util.PriorityQueue;

/**
 * 329. Longest Increasing Path in a Matrix (Hard)
 * 
 * Given and m x n integers matrix, return the length of the longest increasing path in matrix.
 * 
 * From each cell, you can either move in four directions: left, right, up, or down.
 * You may not move diagonally or move outside the bounary (i.e., wrap-around is not allowed).
 * 
 * @author: Rain Hu
 * @version: 2
 * @since: 2022/5/19
 * @apiNote: dfs, priority queue
 */

public class n329_LongestIncreasingPathInAMatrix {
    public int longestIncreasingPath(int[][] matrix){
        int m = matrix.length, n = matrix[0].length;
        int[][] dp = new int[m][n];
        int res = 1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int len = dfs(matrix, dp, i, j);
                res = Math.max(len, res);
            }
        }
        return res;
    }

    public static int[][] dirs = {{0,1},{1,0},{0,-1},{-1,0}};

    private int dfs(int[][] matrix, int[][] dp, int i, int j){
        int m = matrix.length, n = matrix[0].length;
        if (dp[i][j] != 0) return dp[i][j];
        int max = 1;
        for (int[] dir : dirs){
            int x = i + dir[0];
            int y = j + dir[1];
            if (x < 0 || x >= m || y < 0 || y >= n || matrix[x][y] >= matrix[i][j]) continue;
            int len = 1 + dfs(matrix, dp, x, y);
            max = Math.max(len, max);
        }
        dp[i][j] = max;
        return max;
    }

    // solution2

    int m;
    int n;
    public int longestIncreasingPath2(int[][] matrix){
        int max = 1;
        this.m = matrix.length;
        this.n = matrix[0].length;
        int[][] dp = new int[m][n];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[0] - b[0] != 0 ? a[0] - b[0] : (a[1] - b[1] != 0 ? a[1] - b[1] : a[2] - b[2]));  // [val, x, y]
        for (int r = 0; r < m; r++){
            for (int c = 0; c < n; c++){
                pq.offer(new int[]{matrix[r][c], r, c});
            }
        }
        while (!pq.isEmpty()){
            int[] e  = pq.poll();
            int row = e[1];
            int col = e[2];
            int tmp = isValid(matrix, dp, row, col);
            dp[row][col] = tmp + 1;
            max = Math.max(dp[row][col], max);
        }
        return max;
    }
    private int isValid(int[][] matrix, int[][] dp, int r, int c){
        int top = 0, bot = 0, left = 0, right = 0;
        int val = matrix[r][c];

        if (inBound(r-1, c))
            top   = matrix[r-1][c] == val ? 0 : dp[r-1][c];
        if (inBound(r, c-1))
            left  = matrix[r][c-1] == val ? 0 : dp[r][c-1];
        if (inBound(r+1, c))
            bot   = matrix[r+1][c] == val ? 0 : dp[r+1][c];
        if (inBound(r, c+1))
            right = matrix[r][c+1] == val ? 0 : dp[r][c+1];

        return Math.max(Math.max(top, bot), Math.max(left, right));
    }
    private boolean inBound(int x, int y){
        return x >= 0 && x < m && y >= 0 && y < n;
    }
}
