package com.rainhu;

/**
 * 1463. Cherry Pickup II (Hard)
 * You are given a rows x cols matrix grid representing a field of cherries where grid[i][j] represents
 * the number of cherries that you can collect from the (i, j) cell.
 * 
 * You have two robots that can collect cherries for you:
 *     + Robot #1 is located at the top-left corner (0, 0), and
 *     + Robot #2 is located at the top-right corner (0, cols - 1).
 * 
 * Return the maximum number of cherries collection using both robots by following the rules below:
 *     + From a cell (i, j), robots can move to cell (i + 1, j - 1), (i + 1, j), or (i + 1, j + 1).
 *     + When any robot passes through a cell, It picks up all cherries, and the cell becomes an empty cell.
 *     + When both robots stay in the same cell, only one takes the cherries.
 *     + Both robots cannot move outside of the grid at any moment.
 *     + Both robots should reach the bottom row in grid.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/1/8
 * @apiNote:
 */


public class n1463_CherryPickupII {

    public int cherryPickup(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        
        int max_c1 = 1;
        int min_c2 = cols;
        
        int[][][] dp = new int[rows+1][cols+1][cols+1];
        for (int r = 1; r <= rows; r++){
            for (int c1 = 1; c1 <= cols && c1 <= max_c1; c1++){
                for (int c2 = cols; c2 >= 1 && c2 >= min_c2; c2--){
                    int max = 0;
                    for (int i = -1; (i <= 1) && (c1 + i >= 0) && (c1 + i <= cols); i++)
                        for (int j = -1; (j <= 1) && (c2 + j >= 0) && (c2 + j <= cols); j++)
                            max = Math.max(max, dp[r-1][c1+i][c2+j]);
                    int curr = c1 == c2 ? grid[r-1][c1-1] : grid[r-1][c1-1] + grid[r-1][c2-1];
                    dp[r][c1][c2] = curr + max;
                }
            }
            max_c1++;
            min_c2--;
        }
        
        int ans = 0;
        for (int c1 = 1; c1 <= cols; c1++)
            for (int c2 = c1; c2 <= cols; c2++)
                ans = Math.max(ans, dp[rows][c1][c2]);
        return ans;
    }

    public static void main(String[] args){
        int[][] grid = new int[][]{{3,1,1},{2,5,1},{1,5,5},{2,1,1}};
        n1463_CherryPickupII clz = new n1463_CherryPickupII();
        int res = clz.cherryPickup(grid);
        System.out.println(res);
    }
}
