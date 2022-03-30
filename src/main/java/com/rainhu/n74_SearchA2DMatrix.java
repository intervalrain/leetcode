package com.rainhu;

/**
 * 74. Search a 2D Matrix (Medium)
 * 
 * Wrtie an efficient algorithm that searches for a value target in an m x n integer matrix.
 * This matrix has the following properties:
 *      + Integers in each row are sorted from left to right.
 *      + The first integer of each row is greater than the last integer of the previous row.
 */

public class n74_SearchA2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target){
        int n = matrix.length;
        int m = matrix[0].length;
        int left = 1;
        int right = m * n;
        int mid; 
        while (left <= right){
            mid = left + (right - left)/2;
            int x = (mid-1) / m;
            int y = (mid-1) % m;
            if (matrix[x][y] < target){
                left = mid + 1;
            } else if (matrix[x][y] > target) {
                right = mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
