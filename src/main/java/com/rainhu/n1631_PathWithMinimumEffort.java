package com.rainhu;

/**
 * 1631. Path With Minimum Effort (Medium)
 * 
 * You are a hiker preparing for an upcoming hike.
 * You are given heights, a 2D array of size rows x columns,
 * where height[row][col] represents the height of cell(row, col).
 * You are situated in the top-left cell (0, 0), 
 * and you hope to travel to the bottom-right cell,
 * (row-1, columns-1) (i.e., 0-indexed).
 * You can move up, down, left or right,
 * and you wish to find a route the that requires the minimum effort.
 * 
 * A route's effort is the maximum absolute difference in heights between two consecutive cells of the route.
 * 
 * Return the minimum effort required to travel from the top-left cell to the bottom-right cell.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/4/28
 * @apiNote:
 */



// 1 2 2
// 3 8 2
// 5 3 5

public class n1631_PathWithMinimumEffort {

    int[][] step = new int[][]{{1,0},{0,1},{-1,0},{0,-1}};
    boolean[][] matrix;
    int rows;
    int cols;
    int row;
    int col;

    public int minimumEffortPath(int[][] heights) {
        int rows = heights.length; 
        int cols = heights[0].length; 
        row = 0;
        col = 0;
        matrix = new boolean[rows][cols];
        matrix[0][0] = true;
        return 0;
    }
    
    public static void main(String[] args){
        int[][] heights = new int[][]{{1,2,2},{3,8,2},{5,3,5}};
        n1631_PathWithMinimumEffort clz = new n1631_PathWithMinimumEffort();
        int actual = clz.minimumEffortPath(heights);
        System.out.println(actual);
    }
}
