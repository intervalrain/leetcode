package com.rainhu;

/**
 * 304. Range Sum Query 2D, Immutable (Medium)
 * 
 * Given a 2D matrix matrix, handle multiple queries of the following type:
 *      + Calculate the sum of the elements of matrix inside the rectangle defined by its upper left corner (row1, col1) and lower right corner (row2, col2).
 * Implement the NumMatrix class:
 *      + NumMatrix(int[][] matrix) Initializes the object with the integer matrix matrix.
 *      + int sumRegion(int row1, int col1, int row2, int col2) Returns the sum of the elements of matrix inside the rectangle defined by its upper left corner (row1, col1) and lower right corner (row2, col2).
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/6/3
 * @apiNote: dynamic programming
 */

public class n304_RangeSumQuery2DImmutable {
    int[][] grid;
    public n304_RangeSumQuery2DImmutable(int[][] matrix) {
        int[][] sums = new int[matrix.length][matrix[0].length];
        sums[0][0] = matrix[0][0];
        for (int i = 1; i < matrix.length; i++){
            sums[i][0] = sums[i-1][0] + matrix[i][0]; 
        }
        for (int j = 1; j < matrix[0].length; j++){
            sums[0][j] = sums[0][j-1] + matrix[0][j];
        }
        for (int i = 1; i < matrix.length; i++){
            for (int j = 1; j < matrix[0].length; j++){
                sums[i][j] = sums[i-1][j] + sums[i][j-1] - sums[i-1][j-1] + matrix[i][j];        
            }
        }
        this.grid = sums;
    }
    public int sumRegion(int row1, int col1, int row2, int col2) {
        if (row1 == 0 && col1 == 0)
            return grid[row2][col2];
        else if (row1 == 0)
            return grid[row2][col2] - grid[row2][col1-1];
        else if (col1 == 0)
            return grid[row2][col2] - grid[row1-1][col2];
        return grid[row2][col2] - grid[row1-1][col2] - grid[row2][col1-1] + grid[row1-1][col1-1];
    }
}
