package com.rainhu;

import java.util.ArrayList;
import java.util.List;

/**
 * 1260. Shift 2D Grid (Easy)
 * 
 * Given a 2D grid of size m x n and an integer k.
 * You need to shift the grid k times.
 * 
 * In one shift operation:
 *      + Element at grid[i][j] moves to grid[i][j + 1].
 *      + Element at grid[i][n - 1] moves to grid[i + 1][0];
 *      + Element at grid[m - 1][n - 1] moves to grid[0][0];
 * 
 * Retrun the 2D grid after applying shift operation k times.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/4/12
 * @apiNote: array
 */

public class n1260_Shift2DGrid {
    public List<List<Integer>> shiftGrid(int[][] grid, int k){
        int m = grid.length;
        int n = grid[0].length;
        int mod = m * n;
        k = mod - k % mod;
        int cnt = 0;
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        while (cnt < m * n){
            int curr = (cnt + k) % mod;
            int row = curr / n; 
            int col = curr % n;
            list.add(grid[row][col]);
            if ((cnt + 1) % n == 0){
                res.add(list);
                list = new ArrayList<>();
            }
            cnt++;
        }
        return res;
    }
}
