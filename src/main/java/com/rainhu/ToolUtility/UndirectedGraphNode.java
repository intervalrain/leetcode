package com.rainhu.ToolUtility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UndirectedGraphNode {
    public int val;
    public List<UndirectedGraphNode> neighbors;
    public UndirectedGraphNode() {
        val = 0;
        neighbors = new ArrayList<UndirectedGraphNode>();
    }
    public UndirectedGraphNode(int _val) {
        val = _val;
        neighbors = new ArrayList<UndirectedGraphNode>();
    }
    public UndirectedGraphNode(int _val, ArrayList<UndirectedGraphNode> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }

    public UndirectedGraphNode(int[][] adjList){
        int n = adjList.length;
        UndirectedGraphNode[] nodes = new UndirectedGraphNode[n];
        for (int i = 0; i < n; i++){
            nodes[i] = new UndirectedGraphNode(i+1);
        }
        for (int i = 0; i < n; i++){
            List<UndirectedGraphNode> list = new ArrayList<>();
            for (int adjNodes: adjList[i]){
                list.add(nodes[adjNodes-1]);
            }
            nodes[i].neighbors = list;
        }
        this.val = 1;
        this.neighbors = nodes[0].neighbors;
    }

    public UndirectedGraphNode[] getNodes(UndirectedGraphNode node){
        if (node.neighbors.size() == 0)
            return new UndirectedGraphNode[]{node};
        Set<UndirectedGraphNode> set = new HashSet<>();
        getUndirectedGraphNodes(node, set);
        UndirectedGraphNode[] res = new UndirectedGraphNode[set.size()];
        for (UndirectedGraphNode rem : set){
            res[rem.val-1] = rem;
        }
        return res;
    }
    private void getUndirectedGraphNodes(UndirectedGraphNode node, Set<UndirectedGraphNode> set){
        List<UndirectedGraphNode> remainNodes = new ArrayList<>();
        for (int i = 0; i < node.neighbors.size(); i++){
            if (!set.contains(node.neighbors.get(i))){
                UndirectedGraphNode neighborNode = node.neighbors.get(i);
                set.add(neighborNode);
                remainNodes.add(neighborNode);
            }
        }
        if (remainNodes.size() == 0)
            return;
        for (int i = 0; i < remainNodes.size(); i++){
            getUndirectedGraphNodes(remainNodes.get(i), set);
        }
    }

    public boolean equals(UndirectedGraphNode expected){
        UndirectedGraphNode[] a = getNodes(this);
        UndirectedGraphNode[] b = getNodes(expected);
        if (a.length != b.length)
            return false;
        for (int i = 0; i < a.length; i++){
            if (!equals(a[i], b[i]))
                return false;
        }
        return true;
    }

    private boolean equals(UndirectedGraphNode actual, UndirectedGraphNode expected){
        if (expected.val != actual.val)
            return false;
        if (expected.neighbors.size() != actual.neighbors.size())
            return false;
        int n = expected.neighbors.size();
        int[] arya = new int[n];
        int[] aryb = new int[n];
        for (int i = 0; i < n; i++){
            arya[i] = expected.neighbors.get(i).val;
            aryb[i] = actual.neighbors.get(i).val;
        }
        Arrays.sort(arya);
        Arrays.sort(aryb);
        return Arrays.equals(arya, aryb);
    }
}
