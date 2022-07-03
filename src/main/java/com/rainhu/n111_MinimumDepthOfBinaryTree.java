package com.rainhu;

import java.util.LinkedList;
import java.util.Queue;

import com.rainhu.util.TreeNode;

/**
 * 111. Minimum Depth of Binary Tree (Easy)
 * 
 * Given a binary tree, find its minimum depth.
 * 
 * The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
 * 
 * Note: A leaf is a node with no children.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2021/11/12
 * @apiNote: TreeNode traversal & constrcut & iterate
 */

public class n111_MinimumDepthOfBinaryTree {
    public int minDepth(TreeNode root){
        int depth = 0;
        Queue<TreeNode> q = new LinkedList<>();
        if (root == null)
            return depth;
        q.add(root);
        depth++;
        while(!q.isEmpty()){
            int size = q.size();
            for (int i = 0; i < size; i++){
                TreeNode curr = q.remove();
                if (curr.left == null && curr.right == null)
                    return depth;
                if (curr.left != null)
                    q.add(curr.left);
                if (curr.right != null)
                    q.add(curr.right);
            }
            depth++;
        }
        return depth;    
    }
}
