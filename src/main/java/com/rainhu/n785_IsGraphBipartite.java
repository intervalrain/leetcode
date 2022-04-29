package com.rainhu;

import java.util.LinkedList;

/**
 * 785. Is Graph Bipartile? (Medium)
 * 
 * There is an undirected graph with n nodes, 
 * where each node is numbered between 0 and n - 1. 
 * You are given a 2D array graph, 
 * where graph[u] is an array of nodes that node u is adjacent to. 
 * More formally, for each v in graph[u], 
 * there is an undirected edge between node u and node v. 
 * The graph has the following properties:
 *      + There are no self-edges (graph[u] does not contain u).
 *      + There are no parallel edges (graph[u] does not contain duplicate values).
 *      + If v is in graph[u], then u is in graph[v] (the graph is undirected).
 *      + The graph may not be connected, meaning there may be two nodes u and v such that there is no path between them.
 *      + A graph is bipartite if the nodes can be partitioned into two independent sets A and B such that every edge in the graph connects a node in set A and a node in set B.
 * 
 * Return true if and only if it is bipartite.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/4/29
 * @apiNote: DFS, BFS
 */

public class n785_IsGraphBipartite {
    // DFS
    public boolean isBipartite2(int[][] graph){
        int n = graph.length;
        int[] colors = new int[n];
        for (int i = 0; i < n; i++){
            if (colors[i] == 0 && !valid(graph, colors, i, 1)) return false; // cannot be separate
        }
        return true;
    }

    private boolean valid(int[][] graph, int[] colors, int node, int color){
        if (colors[node] != 0) return colors[node] == color; // confict return false, comparable return true
        colors[node] = color;
        for (int next : graph[node]){
            if (!valid(graph, colors, next, -color)) return false;
        }
        return true;
    }

    // BFS
    public boolean isBipartite (int[][] graph){
        int n = graph.length;
        int[] colors = new int[n];
        for (int i = 0; i < n; i++){
            if (colors[i] == 0){
                LinkedList<Integer> todo = new LinkedList<>();
                todo.push(i);
                colors[i] = 1;
                while (!todo.isEmpty()){
                    int node = todo.peekFirst();
                    todo.pop();
                    for (int next:graph[node]){
                        if (colors[next] == 0){
                            colors[next] = -colors[node];
                            todo.push(next);
                        } else if (colors[next] == colors[node]){
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}
