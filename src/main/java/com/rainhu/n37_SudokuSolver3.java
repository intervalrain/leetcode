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
 * @version: 3
 * @since: 2022/8/29
 * @apiNote: 
 */
public class n37_SudokuSolver3{
    
    class Bit{
        int bit;
        String bitString;
        Bit(int val){
            set(val);
        }
        public String toString(){
            return bitString;
        }
        public void set(int val){
            this.bit = val;
            bitString = Integer.toBinaryString(bit);
            int cnt = 9 - bitString.length();
            while (cnt-- > 0){
                bitString = "0" + bitString;
            }
        }
        public void and(int val){
            set(bit & val);
        }
        public void or(int val){
            set(bit | val);
        }
    }

    int[] boxs;
    int[] rows;
    int[] cols;
    int[] seq;
    // int[] e;
    // int[] box;
    // int[] row;
    // int[] col;

    Bit[] e;
    Bit[] box;
    Bit[] row;
    Bit[] col;

    int ptr;

    public void swap(int a, int b){
        int tmp = seq[a];
        seq[a] = seq[b];
        seq[b] = tmp;
    }

    public int next(int p){
        int Possibles = 0;
        int bitCnt = 0;
        int min = 9;
        int q = p;
        int x = 0;
        for (int i = p; i < 81; i++){
            x = seq[i];
            Possibles = box[boxs[x]].bit & row[rows[x]].bit & col[cols[x]].bit;
            bitCnt = Integer.bitCount(Possibles);
            if (bitCnt == 1){
                q = i;
                break;
            } else if (bitCnt < min){
                min = bitCnt;
                q = i;
            }
        } 
        return q;
    }

    public void memoize(){
        ptr = 0;
        boxs = new int[81];
        rows = new int[81];
        cols = new int[81];
        seq  = new int[81];
        // e    = new int[81];
        // box  = new int[9];
        // row  = new int[9];
        // col  = new int[9];
        e    = new Bit[81];
        box  = new Bit[9];
        row  = new Bit[9];
        col  = new Bit[9];

        for (int i = 0; i < 9; i++){
            for (int j = 0; j < 9; j++){
                int x = 9*i+j;
                rows[x] = i;
                cols[x] = j;
                boxs[x] = (i/3)*3 + (j/3);
            }
        }
        for (int x = 0; x < 81; x++){
            e[x] = new Bit(0);
            seq[x] = x;
        }
        for (int i = 0; i < 9; i++){
            box[i] = new Bit(0x1ff);
            row[i] = new Bit(0x1ff);
            col[i] = new Bit(0x1ff);
        }
    }

    public void init(char[][] board){
        for (int i = 0; i < 9; i++){
            for (int j = 0; j < 9; j++){
                char ch = board[i][j];
                if (ch == '.') continue;
                int shift = ch - '1';
                int bit = (1 << shift);
                int x = 9*i+j;

                e[x].set(bit);
                box[boxs[x]].and(~bit);
                row[rows[x]].and(~bit);
                col[cols[x]].and(~bit);

                int q = ptr;
                while (q < 81 && seq[q] != x) q++;
                swap(ptr, q);
                ptr++;
            }
        }
    }

    public void place(int p, char[][] board){
        if (p >= 81){
            finalize(board);
            return;
        }
        
        int q = next(p);
        swap(p,q);
        int x = seq[p];

        // int p = box[boxs[x]] & row[rows[x]] & col[cols[x]];
        int Possibles = box[boxs[x]].bit & row[rows[x]].bit & col[cols[x]].bit;
        while (Possibles > 0){
            int bit = Possibles & (-Possibles);
            Possibles &= ~bit;
            e[x].set(bit);
            box[boxs[x]].and(~bit);
            row[rows[x]].and(~bit);
            col[cols[x]].and(~bit);

            place(p+1, board);

            e[x].set(0x1ff);
            box[boxs[x]].or(bit);
            row[rows[x]].or(bit);
            col[cols[x]].or(bit);
        }
        swap(p,q);
    }

    public void finalize(char[][] board){
        int x = 0;
        char ch = '-';
        for (int i = 0; i < 9; i++){
            for (int j = 0; j < 9; j++){
                int bit = e[x++].bit;
                for (int val = 1; val <= 9; val++){
                    if (bit == (1 << (val-1))){
                        ch = (char)('0' + val);
                        break;
                    }
                }
                board[i][j] = ch;
            }
        }
    }
    

    public void solveSudoku(char[][] board) {
        memoize();
        init(board);
        place(ptr, board);
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
        new n37_SudokuSolver3().solveSudoku(board);
        print(board);

    }
    public static void print(char[][] board){
        for (char[] row : board){
            for (char c : row){
                System.out.print(c);
            }
            System.out.println();
        }
    }
}

