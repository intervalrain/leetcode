package com.rainhu;

import java.util.Arrays;

/**
 * 1584. Min Cost to Connect All Points
 * 
 * You are given an array points representing integer coordinates of some points on a 2D-plane, 
 * where points[i] = [xi, yi].
 * 
 * The cost of connecting two points [xi, yi] and [xj, yj] is the manhattan distance between them: |xi - xj| + |yi - yj|, 
 * where |val| denotes the absolute value of val.
 * 
 * Return the minimum cost to make all points connected. All points are connected if there is exactly one simple path between any two points.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/4/26
 * @apiNote
 */

public class n1584_MinCostToConnectAllPoints {

    
    // best solution
    public int minCostConnectPoints(int[][] points) {
        int res = 0;
        int n = points.length;
        int[] mins = new int[n];
        Arrays.fill(mins, Integer.MAX_VALUE);
        boolean[] connected = new boolean[n];

        // start with first node.
        connected[0] = true;
        int cnt = 1;
        int i = 0;

        // find next node;
        int next = 0;

        while (cnt < n){
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < n; j++){
                if (connected[j] == true) continue;
                int dist = Math.abs(points[i][0] - points[j][0]) + Math.abs(points[i][1] - points[j][1]);
                mins[j] = Math.min(dist, mins[j]);
                if (mins[j] < min){
                    next = j;
                    min = mins[j];
                }
            }
            connected[next] = true;
            i = next;
            res += min;
            cnt++;
        }

        return res;
    }
}
