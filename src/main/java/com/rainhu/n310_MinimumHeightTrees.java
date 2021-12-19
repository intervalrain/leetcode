package com.rainhu;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 310. Minimum Height Trees
 * 
 * A tree is an undirected graph in which any two vertices are connected by exactly one path. 
 * In other words, any connected graph without simple cycles is a tree.
 * 
 * Given a tree of n nodes labelled from 0 to n - 1, 
 * and an array of n - 1 edges where edges[i] = [ai, bi] indicates that 
 * there is an undirected edge between the two nodes ai and bi in the tree, 
 * you can choose any node of the tree as the root. When you select a node x as the root, 
 * the result tree has height h. 
 * Among all possible rooted trees, 
 * those with minimum height (i.e. min(h)) are called minimum height trees (MHTs).
 * 
 * Return a list of all MHTs' root labels. 
 * You can return the answer in any order.
 * The height of a rooted tree is the number of edges on the longest downward path between the root and a leaf.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2021/12/16
 * @apiNote:
 */

public class n310_MinimumHeightTrees {
    public List<Integer> findMinHeightTrees(int n, int[][] edges){
        if (n == 1) return List.of(0);
        List<Set<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++){
            graph.add(new HashSet<>());
        }
        for (int[] edge : edges){
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }

        List<Integer> leaves = new ArrayList<>();

        for (int i = 0; i < n; i++){
            if (graph.get(i).size() == 1) leaves.add(i);
        }

        while (n > 2){
            n -= leaves.size();
            List<Integer> newLeaves = new ArrayList<>();
            for (int leave : leaves){
                int j = graph.get(leave).iterator().next();
                graph.get(j).remove(leave);
                if (graph.get(j).size() == 1) newLeaves.add(j);
            }
            leaves = newLeaves;
        }
        return leaves;
    }

    public static void main(String[] args){
        n310_MinimumHeightTrees clz = new n310_MinimumHeightTrees();
        int[][] edges = new int[][]{{1,0},{1,2},{1,3}};
        int n = 4;
        System.out.println(clz.findMinHeightTrees(n, edges));
    }
}
