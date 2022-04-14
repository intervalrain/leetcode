package com.rainhu;

import java.util.HashMap;
import java.util.Map;

import com.rainhu.ToolUtility.UndirectedGraphNode;

/**
 * 133. Clone Graph (Medium)
 * 
 * Given a reference of a node in a connected undirected graph.
 * 
 * Return a deep copy (clone) of the graph
 * 
 * Each node in the fraph contains a (int) and a list(List[Node]) of its neighbors.
 * 
 * Test case format:
 * For simplicity, each node's value is the same as the node's index (1-indexed).
 * For example, the first node with val == 1,
 * the second node with val == 2, and so on.
 * The graph is represented in the test case using an adjacency list.
 * 
 * An adjacency list is a collection of unordered lists used to represent a finite graph.
 * Each list describes the set of neighbors of a node in the graph.
 * 
 * The given node will always be the first node with val = 1.
 * You must return the copy of the given node as a reference to the cloned graph.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/2/24
 * @apiNote: dfs
 */

public class n133_CloneGraph {
    
    private Map<Integer, UndirectedGraphNode> map = new HashMap<>();

    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        return dfs(node);
    }
    private UndirectedGraphNode dfs(UndirectedGraphNode node){
        if (node == null) return null;
        if (map.containsKey(node.val)){
            return map.get(node.val);
        }
        UndirectedGraphNode clone = new UndirectedGraphNode(node.val);
        map.put(clone.val, clone);
        for (UndirectedGraphNode neighbor: node.neighbors){
            clone.neighbors.add(dfs(neighbor));
        }
        return clone;
    }
}
