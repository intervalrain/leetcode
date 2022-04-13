package com.rainhu;

/**
 * 59. Spiral Matrix II (Medium)
 * 
 * Given a positive integer n,
 * generate an n x n matrix filled with elements from 1 to n^2 in spiral order.
 * 
 * @author: Rain Hu
 * @since: 2022/4/14
 * @version: 1
 * @apiNote: graph
 */

public class n59_SpiralMatrixII {
    int[][] board;
    int n;
    public int[][] generateMatrix(int n){
        this.n = n;
        board = new int[n][n];
        int i = 0;
        int x = -1;
        int y = 0;
        int k = 0;
        int[][] step = new int[][]{{1,0},{0,1},{-1,0},{0,-1}};
        while (i < n * n){
            if (isWall(x + step[k][0], y + step[k][1])){
                k = (k + 1) % 4;
            }
            x += step[k][0];
            y += step[k][1];
            board[y][x] = ++i;
        }
        return board;
    }

    public boolean isWall(int x, int y){
        if (x < 0 || x >= n || y < 0 || y >= n) return true;
        if (board[y][x] != 0) return true;
        return false;
    }
}
