package com.rainhu;

import com.rainhu.ToolUtility.TreeNode;

/**
 * 687. Longest Univalue Path (Medium)
 * 
 * Given the root of a binary tree, return the length of the longest path,
 * where each node in the path has the same value.
 * This path may or may not pass through the root.
 * 
 * The length of the path between two nodes is represented by the number of edges between them.
 */

public class n687_LongestUnivaluePath {
    public int len = 0;
    public int longestUnivaluePath(TreeNode root){
        helper(root, root.val);
        return len;
    }
    public int helper(TreeNode node, int val){
        if (node == null)
            return 0 ;
        int left = helper(node.left, node.val);
        int right = helper(node.right, node.val);
        len = Math.max(len, left + right);
        if (val == node.val)
            return Math.max(left, right) + 1;
        return 0;
            
    }
}
