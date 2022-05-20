package com.rainhu;

/**
 * Unique Path II (Medium)
 * 
 * You are given an m x n integer array grid.
 * There is a robot initially located at the top-left corner.
 * The robot tries to move to the bottom-right corner.
 * The robot can only move either down or right at any point in time.
 * 
 * An obstacle and space are marked as 1 or 0 respectively in grid.
 * A path that the robot takes cannot include any square that is an obstacle.
 * 
 * Return the number of possible unique paths that the robot can take to reach the bottom-right corner.
 * 
 * The testcases are generated so that the answer will be less than or equal to 2 * 10^9.
 * 
 * @author: Rain Hu
 * @version: 2
 * @since: 2022/5/20
 * @apiNot: dfs, dp
 */

public class n63_UniquePathII {
    public int uniquePathsWithObstacles(int[][] obstacleGrid){
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        if (obstacleGrid[0][0] == 1 || obstacleGrid[m-1][n-1] == 1) return 0;
        int[][] dp = new int[m][n];
        dp[0][0] = 1;
        for (int i = 1; i < m; i++) dp[i][0] = obstacleGrid[i][0] == 1 ? 0 : dp[i-1][0];
        for (int j = 1; j < n; j++) dp[0][j] = obstacleGrid[0][j] == 1 ? 0 : dp[0][j-1];
        for (int i = 1; i < m; i++){
            for (int j = 1; j < n; j++){
                dp[i][j] = obstacleGrid[i][j] == 1 ? 0 : dp[i-1][j] + dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }

    public int uniquePathsWithObstacles2(int[][] obstacleGrid){
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        return dfs(obstacleGrid, 0, 0, m, n);
    }
    private int dfs(int[][] grid, int row, int col, int m, int n){
        if (row == m - 1 && col == n - 1) return 1;
        if (row == m || col == n || grid[row][col] == 1) return 0;
        int right = dfs(grid, row, col + 1, m, n);
        int bot = dfs(grid, row + 1, col, m, n);
        return bot + right;
    }
    public static void main(String[] args){
        int[][] grid = new int[][]{{0,0,0,0,0},
                                   {0,0,0,0,0},
                                   {0,1,1,0,0},
                                   {0,1,1,0,0},
                                   {0,0,0,0,0}};
        n63_UniquePathII clz = new n63_UniquePathII();
        System.out.println(clz.uniquePathsWithObstacles(grid));
    }
}
