package com.rainhu;

/**
 * 289. Game of Life (Medium)
 * 
 * According to Wikipedia's article: "The Game of Life, 
 * also known simply as Life,
 * is a cellular automation devised by the British mathematicain John Horton Conway in 1970."
 * 
 * The board is made up of an m x n grid of cells,
 * where each cell has an initial state: live (representd by a 1) or dead (represented by a 0).
 * Each cell interacts with eight neighbors (horizontal, vertical, diagonal) using the following four rules
 * (taken from the above wikipedia artticle):
 *      1. Any live cell with fewer than two live neighbors dies as if caused by under-population.
 *      2. Any live cell with two or three live neighbors lives on to the next generation.
 *      3. Any live cell with more than three live neighbors dies,as if by over-population.
 *      4. Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.
 * 
 * The next state is created by applying the above rules simultanously to every cell in the current state,
 * where births and deaths occur simultaneously. 
 * Given the current state of the m x n  grid board,
 * return the next state.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/4/12
 * @apiNote: 
 */

public class n289_GameOfLife {

    // lives dies if cnt = 0,1,4,5,6,7,8
    // lives lives if cnt = 2,3
    // dies dies if cnt = 0,1,2,4,5,6,6,7
    // die lives if cnt = 3
    public void gameOfLife(int[][] board){
        int m = board.length;
        int n = board[0].length;
        int[][] newone = new int[m][n];
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                int cnt = count(board, i, j);
                if (board[i][j] == 0){          // if die
                    newone[i][j] = (cnt == 3) ? 1 : 0;
                } else if (board[i][j] == 1){   // if lives
                    newone[i][j] = (cnt == 2 || cnt == 3) ? 1 : 0;
                }
            }
        }
        update(newone, board);
    }
    public void update(int[][] src, int[][] target){
        for (int i = 0; i < src.length; i++){
            for (int j = 0; j < src[0].length; j++){
                target[i][j] = src[i][j];
            }
        }
    }
    public static int count(int[][] board, int x, int y){
        int m = board.length;    // row
        int n = board[0].length; // column
        int cnt = 0;
        for (int i = x - 1; i <= x + 1; i++){       // row
            for (int j = y - 1; j <= y + 1; j++){   // column
                if (i < 0 || i >= m || j < 0 || j >= n) continue;
                cnt += board[i][j];
            }
        }
        return cnt - board[x][y];
    }
}
