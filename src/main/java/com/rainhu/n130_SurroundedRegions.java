package com.rainhu;

/**
 * 130. Surrounded Regions (Medium)
 * 
 * Given an m * n matrix board containing 'X' and 'O',
 * capture all regions that are 4-directionally surrounded by 'X'.
 * 
 * A region is captured by flipping all 'O's into 'X's in that surrounded region.
 * 
 * @author: Rain Hu
 * @version: 0
 * @since: 2021/11/4
 * @apiNote: DFS
 * 
 */

public class n130_SurroundedRegions {
    
    char V = 'V';
    char O = 'O';
    char X = 'X';

    public void solve(char[][] board){
        int R = board.length - 1;
        int C = board[0].length - 1;
        char toChar = V;
        for (int i = 0; i <= R; i++){
            if (board[i][0] == 'O') diffuse(board, i, 0, toChar);
            if (board[i][C] == 'O') diffuse(board, i, C, toChar);
        }
        for (int i = 0; i <= C; i++){
            if (board[0][i] == 'O') diffuse(board, 0, i, toChar);
            if (board[R][i] == 'O') diffuse(board, R, i, toChar);
        }
        convert(board, O, X);
        convert(board, V, O);
    }

    public void convert(char[][] board, char fromChar, char toChar){
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board[0].length; j++){
                if (board[i][j] == fromChar)
                    board[i][j] = toChar;
            }
        }
    }

    public void diffuse(char[][] board, int r, int c, char toChar){
        if (r < 0 || c < 0 || r >= board.length || c >= board[0].length || board[r][c] != 'O')
            return;
        board[r][c] = toChar;
        diffuse(board, r+1, c, toChar);
        diffuse(board, r-1, c, toChar);
        diffuse(board, r, c+1, toChar);
        diffuse(board, r, c-1, toChar);
    }
}
