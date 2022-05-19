package com.rainhu;

import java.util.Arrays;

/**
 * 743. Network Delay Time (Medium)
 * 
 * You are given a network of n nodes,
 * labeled from 1 to n.
 * You are also given times,
 * a list of travel times as directed edges times[i] = (ui, vi, wi), where 
 * ui is the source node,
 * vi is the target node,
 * wi is the time it takes for a signal to travel from source to target.
 * 
 * We will send a signal from a given node k.
 * Return the time it takes for all the n nodes to receive the signal.
 * If it is impossible for all the n nodes to receive the signal, return -1.
 * 
 * @author: Rain Hu
 * @version; 1
 * @since: 2022/5/14
 * @apiNote
 */

public class n743_NetworkDelayTime {
    public int networkDelayTime(int[][] times, int n, int k){
        final int INF = Integer.MAX_VALUE/2;
        int[][] graph = new int[n][n];
        for (int i = 0; i < n; i++){
            Arrays.fill(graph[i], INF);
        }
        for (int t[] : times){
            int x = t[0] - 1;
            int y = t[1] - 1;
            graph[x][y] = t[2];
        }
        int[] dist = new int[n];
        Arrays.fill(dist, INF);
        boolean[] used = new boolean[n];

        dist[k-1] = 0;

        for (int i = 0; i < n; i++){
            int x = -1;
            for (int y = 0; y < n; y++){
                if (!used[y] && (x == -1 || dist[y] < dist[x])){
                    x = y;
                }
            }
            used[x] = true;
            for (int y = 0; y < n; y++){
                dist[y] = Math.min(dist[y], dist[x] + graph[x][y]);
            }
        }

        int ans = 0;
        for (int i = 0; i < n; i++){
            ans = Math.max(ans, dist[i]);
        }

        return ans == INF ? -1 : ans;
    }
    public static void main(String[] args){
        int[][] times = new int[][]{{2,1,1},{2,3,1},{3,4,1}};
        int n = 4;
        int k = 2;
        n743_NetworkDelayTime clz = new n743_NetworkDelayTime();
        System.out.println(clz.networkDelayTime(times, n, k));
    }    
}
