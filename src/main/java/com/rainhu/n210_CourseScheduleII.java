package com.rainhu;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * 210. Course ScheduleII (Medium)
 * 
 * There are a total of numCourses courses you have to take,
 * labeled from 0 to numCourses - 1.
 * You are given an array prerequisites where prerequisites[i] = [ai, bi] indicates that
 * you must take course bi first if you want to take course ai.
 *     + Fro example, the pair [0, 1] indicates that to take course 0 you have to first take course i.
 * Return the ordering of courses you should take to finish all courses.
 * If there are many valid answers,
 * return anu of them.
 * If it is impossible to finish all courses, return an empty array.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2021/12/24
 * @apiNote: 
 * 
 */

public class n210_CourseScheduleII{
    private class Graph{
        int length;
        List<Integer>[] adj;

        boolean[] onStack;
        boolean[] marked;
        int position;
        int[] topo;
        boolean hasCycle;

        Graph(int n){
            length = n;
            adj = new ArrayList[n];
            onStack = new boolean[length];
            marked = new boolean[length];
            topo = new int[length];
            position = 0;
            hasCycle = false;
        }
        void addEdge(int from, int to){
            if (adj[from] == null){
                adj[from] = new ArrayList<>();
            }
            adj[from].add(to);
        }

        int[] topoOrder(){
            for (int i = 0; i < length; i++)
                if (!marked[i]) dfs(i);
            if (hasCycle) return new int[0];
            return topo;
        }

        void dfs(int i){
            if (hasCycle)
                return;
            marked[i] = true;
            onStack[i] = true;
            if (adj[i] != null){
                for (int j : adj[i]){
                    if (!marked[j])
                        dfs(j);
                    else if (onStack[j])
                        hasCycle = true;
                }
            }

            onStack[i] = false;
            topo[position] = i;
            position++;
        }
    }

    public int[] findOrder(int numCourses, int[][] prerequisites){
        Graph g = new Graph(numCourses);
        for (int[] pre : prerequisites){
            g.addEdge(pre[0], pre[1]);
        }
        return g.topoOrder();
    }

}