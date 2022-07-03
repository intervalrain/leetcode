package com.rainhu;

import com.rainhu.util.TreeNode;

/**
 * 112. Path Sum (Easy)
 * 
 * Given the root of a binary tree and an integer targetSum,
 * return true if the tree has a root-to-leaf path such that adding up all the values along the path equals targetSum.
 * 
 * A leaf is a node with no children.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2021/11/18
 * @apiNote: recursion
 */

public class n112_PathSum {
    public boolean hasPathSum(TreeNode root, int targetSum){
        if (root == null) return false;
        return PathSum(root, targetSum, 0);
    }

    public boolean PathSum(TreeNode root, int targetSum, int sum){
        if (root.left == null && root.right == null){
            return sum + root.val == targetSum;
        } else if (root.left != null && root.right == null){
            return PathSum(root.left, targetSum, sum+root.val);
        } else if (root.right != null && root.left == null){
            return PathSum(root.right, targetSum, sum+root.val);
        }
        return PathSum(root.left, targetSum, sum+root.val) || PathSum(root.right, targetSum, sum+root.val);
    }
}
