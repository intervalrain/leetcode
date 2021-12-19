package com.rainhu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 797. All Paths From Source to Target
 * 
 * Given a directed acyclic graph(DAG) of n nodes labeled from 0 to n-1,
 * find all possible paths from node 0 to node n-1 and return them in any order.
 * 
 * The graph is given as shown: graph[i] is alist of all nodes you can visit from node i
 * (i.e., there is a directed edge from node i to node graph[i][j]).
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2021/11/28
 * @apiNote: DFS
 * 
 */

public class n797_AllPathsFromSourceToTarget {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph){
        List<List<Integer>> res = new ArrayList<>();
        findPaths(res, new ArrayList<>(), graph, 0, graph.length - 1);
        return res;
    }

    public void findPaths(List<List<Integer>> res, List<Integer> path, int[][] graph, int start, int end){
        path.add(start);

        if (start == end)
            res.add(new ArrayList<>(path));
        else 
            for(int n:graph[start])
                findPaths(res, path, graph, n, end);
        path.remove(path.size() - 1);
    }

    public static void main(String[] args){
        int[][] graph = new int[][] {{4,3,1}, {3,2,4}, {3}, {4}, {}};
        List<List<Integer>> res = new n797_AllPathsFromSourceToTarget().allPathsSourceTarget(graph);
        for (int i = 0; i < res.size(); i++){
            Arrays.toString(res.get(i).toArray());
        }
    }
}
