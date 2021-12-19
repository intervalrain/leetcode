package com.rainhu;

import java.util.ArrayList;
import java.util.List;

/**
 * 118. Pascal's Triangle (Easy)
 * 
 * Given an integer numRows,
 * return the first numRows of Pascal's triangle.
 * 
 * In Pascal's triangle, each number is the sum of the two numbers directly above it.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2021/11/18
 * @apiNote: dynamic programming
 */


public class n118_PascalsTriangle {
    public List<List<Integer>> generate(int numRows){
        int[][] rows = new int[numRows][numRows];
        for (int i = 0; i < numRows; i++){
            rows[i][0] = 1;
            rows[0][i] = 1;
        }
        for (int i = 1; i < numRows; i++){
            for (int j = 1; j < numRows; j++){
                rows[i][j] = rows[i-1][j] + rows[i][j-1];
            }
        }
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        for (int i = 0; i < numRows; i++){
            List<Integer> subList = new ArrayList<>();
            for (int j = 0; j <= i; j++){
                subList.add(rows[j][i-j]);
            }
            list.add(subList);
        } 
        return list;
    }
}

/**
 * 1 1 1 1 1
 * 1 2 3 4 
 * 1 3 6 
 * 1 4 
 * 1
 */
