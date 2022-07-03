package com.rainhu;

import com.rainhu.util.TreeNode;

/**
 * 110. Balanced Binary Tree (Easy)
 * Given a binary tree, determine if it is height-balanced. 
 * For this problem, a height-balanced binary tree is defined as:
 *   a binary tree in which the left and right subtrees of every node differ in height by no more than 1.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2021/11/12
 * @apiNote: recursion
 */

public class n110_BalancedBinaryTree {
    public boolean isBalanced(TreeNode root){
        if (root == null) return true;
        int left = depth(root.left);
        int right = depth(root.right);
        return Math.abs(left - right) < 2 && isBalanced(root.left) && isBalanced(root.right);
    }
    public int depth(TreeNode root){
        if (root == null) return 0;
        return 1 + Math.max(depth(root.left), depth(root.right));
    }
}
