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
 * @version: 2
 * @since: 2022/2/15
 * @apiNote: 
 */
public class n37_SudokuSolver2{
    boolean[][] rows = new boolean[9][9];
    boolean[][] cols = new boolean[9][9];
    boolean[][] boxs = new boolean[9][9];
    

    public void solveSudoku(char[][] board) {
        // scan sudoku for existing numbers
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                char c = board[row][col];
                if (c == '.') continue;
                rows[row][c - '1'] = true;
                cols[col][c - '1'] = true;
                boxs[row - row % 3 + col / 3][c - '1'] = true;
            }
        }
        // we can invoke solveRecursive here, the bellow do-while block is just an optimization

        // fill sudoku while we can find cells for which only 1 option is possible
        boolean modified;
        do {
            modified = false;
            for (int row = 0; row < 9; row++) {
                for (int column = 0; column < 9; column++) {
                    char c = board[row][column];
                    if (c != '.') {
                        continue;
                    }
                    boolean[] rowSet = rows[row];
                    boolean[] columnSet = cols[column];
                    boolean[] boxSet = boxs[row - row % 3 + column / 3];
                    int optionCount = 0;
                    int option = -1;
                    for (int k = 0; k < 9; k++) {
                        if (rowSet[k] || columnSet[k] || boxSet[k]) {
                            continue;
                        }
                        optionCount++;
                        if (optionCount == 2) {
                            break;
                        }
                        option = k;
                    }
                    if (optionCount == 1) {
                        modified = true;
                        board[row][column] = (char)('1' + option);
                        rowSet[option] = columnSet[option] = boxSet[option] = true;
                    }
                }
            }
        } while (modified);

        // all remaining cells have multiple options possible, use back-tracking
        solveRecursive(board, 0, -1);
    }

    boolean solveRecursive(char[][] board, int row, int column) {
        if (row == 8 && column == 8) {
            return true;
        }
        if (column == 8) {
            column = 0;
            row++;
        } else {
            column++;
        }
        char c = board[row][column];
        if (c != '.') {
            return solveRecursive(board, row, column);
        }
        boolean[] rowSet = rows[row];
        boolean[] columnSet = cols[column];
        boolean[] boxSet = boxs[row - row % 3 + column / 3];
        // try all possible numbers
        for (int k = 0; k < 9; k++) {
            if (rowSet[k] || columnSet[k] || boxSet[k]) {
                continue;
            }
            board[row][column] = (char)('1' + k);
            rowSet[k] = columnSet[k] = boxSet[k] = true;
            if (solveRecursive(board, row, column)) {
                return true;
            } else {
                rowSet[k] = columnSet[k] = boxSet[k] = false;
                board[row][column] = '.';
            }
        }
        return false;
    }



    public static void main(String[] args){
        char[][] board = new char[][]
                {{'5','3','.','.','7','.','.','.','.'},
                 {'6','.','.','1','9','5','.','.','.'},
                 {'.','9','8','.','.','.','.','6','.'},
                 {'8','.','.','.','6','.','.','.','3'},
                 {'4','.','.','8','.','3','.','.','1'},
                 {'7','.','.','.','2','.','.','.','6'},
                 {'.','6','.','.','.','.','2','8','.'},
                 {'.','.','.','4','1','9','.','.','5'},
                 {'.','.','.','.','8','.','.','7','9'}};
        new n37_SudokuSolver2().solveSudoku(board);
    }
}

