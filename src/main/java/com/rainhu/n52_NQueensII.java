package com.rainhu;

/**
 * 52. N-QueensII (Hard)
 * 
 * The n-queens puzzle is the problem of placing n queens on an n x n chessboard such that no two queens attack each other.
 * Given an integer n, return the number of distinct solutions to the n-queens puzzle.
 * 
 * @author: Rain Hu
 * @version: 2
 * @since: 2022/6/5
 * @apiNote: Consider the symmetic case, and reduce half of times.
 */

public class n52_NQueensII {
    
    public int totalNQueens(int n){
        return solve(n, 0, 0, 0, 0);
    }
    public int solve(int n, int row, int col, int diag1, int diag2){
        if (row == n)
            return 1;
        else {
            int cnt = 0;
            int pos = ((1 << n) - 1) & (~(col | diag1 | diag2));
            while (pos != 0){
                int loc = pos & (-pos);
                pos -= loc;
                cnt += solve(n, row + 1, col | loc, (diag1 | loc) << 1, (diag2 | loc) >> 1);
            }
            return cnt;
        }

    }
}
