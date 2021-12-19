package com.rainhu;

/**
 * 104. Maximum Depth of Binary Tree (Easy)
 * 
 * Given the root of a binary tree, return its maximum depth.
 * 
 * A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 */

import com.rainhu.DioUtility.TreeNode;

public class n104_MaximumDepthOfBinaryTree {

    public int maxDepth(TreeNode root){
        if(root == null)
            return 0;
        return Math.max(maxDepth(root.left), maxDepth(root.right))+1;
    }
}
