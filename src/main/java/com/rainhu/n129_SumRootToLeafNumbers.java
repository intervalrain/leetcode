package com.rainhu;

import com.rainhu.ToolUtility.TreeNode;

/**
 * 129. Sum Root to Leaf Numbers (Median)
 * 
 * You are given the root of a binary tree containing digits from 0 to 9 only.
 * Each root-to-leaf path in the tree represents a number.
 * For example, the root-to-leaf path 1 -> 2 -> 3 represents the number 123.
 * 
 * Return the total sum of all root-to-leaf numbers.
 * Test cases are generated so that the answer will fit in a 32-bit integer.
 * 
 * A leaf node is a node with no children.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2021/11/4
 * @apiNote: Use recursion to pass value
 * 
 */

public class n129_SumRootToLeafNumbers {
    public int sumNumbers(TreeNode root){
        return sumUp(root, 0);
    }

    public int sumUp(TreeNode root, int val){
        if (root.left == null && root.right == null){
            return val * 10 + root.val;
        } else if (root.left != null && root.right == null){
            return sumUp(root.left, val * 10 + root.val);
        } else if (root.left == null && root.right != null){
            return sumUp(root.right, val * 10 + root.val);
        }
        return sumUp(root.left, val * 10 + root.val) + sumUp(root.right, val * 10 + root.val);
    }
}
