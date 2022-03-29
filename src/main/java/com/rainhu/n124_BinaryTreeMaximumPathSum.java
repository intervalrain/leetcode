package com.rainhu;

import com.rainhu.DioUtility.TreeNode;

/**
 * 124. Binary Tree Maximum PathSum (Hard)
 * 
 * A path in a binary tree is a sequence of nodes where each pair of adjacent nodes in the sequence has an edge connecting them.
 * A node can only appear in the sequence at most once. 
 * Note that the path does not need to pass through the root.
 * 
 * The path sum of a path is the sum of the node's values in the path.
 * 
 * Given the root of a binary tree, 
 * return the maximum path sum of any non-empty path.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/3/30
 * @apiNote: Binary Tree
 */

public class n124_BinaryTreeMaximumPathSum {
    int res;
    public int maxPathSum(TreeNode root){
        res = Integer.MIN_VALUE;
        oneSideMax(root);
        return res;
    }

    private int oneSideMax(TreeNode root){
        if (root == null) return 0;
        int left = Math.max(0, oneSideMax(root.left));
        int right = Math.max(0, oneSideMax(root.right));
        res = Math.max(res, root.val + left + right);
        return root.val + Math.max(left, right);
    }
}
