package com.rainhu;

import com.rainhu.util.TreeNode;

/**
 * 563. Binary Tree Tilt (Easy)
 * 
 * Given the root of a binary tree,
 * return the sum of every tree node's tilt.
 * 
 * The tilt of tree node is the absolute difference between the sum of all left subtree node values and all right subtree node values.
 * If a node does not have a left child,
 * then the sum of the left subtree node values is treated as 0.
 * The rule is similar if there the node does not have a right child.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2021/12/9
 * @apiNote: Global variable
 */

public class n563_BinaryTreeTilt {

    int sum = 0;
    public int findTilt(TreeNode root){
        process(root);
        return sum;
    }
    
    private int process(TreeNode root){
        if (root == null) return 0;
        int left = process(root.left);
        int right = process(root.right);
        sum += Math.abs(left - right);
        return root.val + left + right;
    }
}
