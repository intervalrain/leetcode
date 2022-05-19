package com.rainhu;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 1091. Shortest Path in Binary Matrix (Medium)
 * 
 * Given an n x n binary matrix grid,
 * return the length or the shortest clear path in the matrix.
 * If there is no clear path, return -1.
 * 
 * A clear path in a binary matrix is a path from the top-left cell to the bottom-right cell such that:
 *      + All the visited cells of the path are 0.
 *      + All the adjacent cells of the path are 8-directionally connected
 *        (i.e., they are different and they share an edge or a corner).
 * 
 * The length of a clear path is the number of visited cells of this path.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/5/17
 * @apiNote: BFS
 */

public class n1091_ShortestPathInBinaryMatrix {

    int[][] dir = new int[][]{{1,1},{1,-1},{-1,1},{-1,-1},{1,0},{0,1},{-1,0},{0,-1}};
    public int shortestPathBinaryMatrix(int[][] grid){
        int n = grid.length;
        if (grid[n-1][n-1] == 1 || grid[0][0] == 1) return -1;
        grid[0][0] = 1;
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{0,0});
        int step = 0;
        while (!q.isEmpty()){
            int size = q.size();
            for (int i = 0; i < size; i++){
                int[] start = q.poll();
                if (start[0] == n-1 && start[1] == n-1) return step+1;
                for (int j = 0; j < 8; j++){
                    int xs = start[0] + dir[j][0];
                    int ys = start[1] + dir[j][1];

                    if (xs < 0 || ys < 0 || xs >= n || ys >= n || grid[xs][ys] == 1) continue;
                    q.add(new int[]{xs,ys});
                    grid[xs][ys] = 1;
                }    
            }
            step++;
        }
        return -1;
    }

}
