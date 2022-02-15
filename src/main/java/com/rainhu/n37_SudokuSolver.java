package com.rainhu;

/**
 * 37. Sudoku Solver (Hard)
 * 
 * Write a program to solve a Sudoku puzzle by filling the empty cells.
 * A sudoku solution must satisfy all of the following rules:
 *   1. Each of the digits 1-9 must occur exactly once in each row.
 *   2. Each of the digits 1-9 must occur exactly once in each column.
 *   3. Each of the digits 1-9 must occur exactly once in each of the 9 3x3 sub-boxes of the grid.
 * The '.' character indicates empty cells.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/2/15
 * @apiNote: back tracking
 */

public class n37_SudokuSolver {
    
    static int n;

    public void solveSudoku(char[][] board){
        if (board == null || board.length == 0)
            return;
        n = board.length;
        solve(board);
    }

    public boolean solve(char[][] board){
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (board[i][j] == '.'){
                    for (char c = '1'; c <= (n + '0'); c++){
                        if (isValid(board, i, j, c)){
                            board[i][j] = c;

                            if (solve(board))
                                return true;
                            else
                                board[i][j] = '.';
                        }
                    }
                    return false;  // 1 - 9 all fail 
                }
            }
        }
        return true;  // no more .
    }

    public boolean isValid(char[][] board, int row, int col, char c){
        for (int i = 0; i < n; i++){
            if (board[i][col] != '.' && board[i][col] == c) return false;
            if (board[row][i] != '.' && board[row][i] == c) return false;
            if (board[3*(row/3)+(i%3)][3*(col/3)+(1-(1%3))/3] != '.' &&
                board[3*(row/3)+(i%3)][3*(col/3)+(1-(1%3))/3] == c) return false;
            // int x = 3 * (row / 3) + (i % 3);
            // int y = 3 * (col / 3) + (1 / 3);

        }
        return true;
    }
}
