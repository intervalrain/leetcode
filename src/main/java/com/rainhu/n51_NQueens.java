package com.rainhu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 51. N-Queens (Hard)
 * 
 * The n-queens puzzle is the problem of placing n queens on an n x n chessboard such that no two queens attack each other.
 * Given an integer n, return all distinct solutions to the n-queens puzzle. 
 * You may return the answer in any order.
 * 
 * Each solution contains a distinct board configuration of the n-queens' placement, 
 * where 'Q' and '.' both indicate a queen and an empty space, respectively.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/4/29
 * @apiNote: Backtracking
 */

public class n51_NQueens {
    List<List<String>> res;
    public List<List<String>> solveNQueens(int n) {
        res = new ArrayList<>();
        List<char[]> board = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            char[] ch = new char[n];
            Arrays.fill(ch, '.');
            board.add(ch);
        }
        backtrack(board, 0);
        return res;
    }
    public void backtrack(List<char[]> board, int row){
        if (row == board.size()){
            List<String> list = new ArrayList<>();
            for (int i = 0; i < board.size(); i++){
                list.add(new String(board.get(i)));
            }
            res.add(list);
            return;
        }
        int n = board.get(row).length;
        for (int col = 0; col < n; col++){
            if (!isValid(board, row, col)) continue;
            board.get(row)[col] = 'Q';
            backtrack(board, row + 1);
            board.get(row)[col] = '.';
        }
    }
    public boolean isValid(List<char[]> board, int row, int col){
        int n = board.size();
        for (int i = 0; i < n; i++){
            if (board.get(i)[col] == 'Q') return false;
        }
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++){
            if (board.get(i)[j] == 'Q') return false;
        }
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--){
            if (board.get(i)[j] == 'Q') return false;
        }
        return true;
    }
}
