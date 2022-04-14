package com.rainhu;

import java.util.List;

import com.rainhu.ToolUtility.TreeNode;

import java.util.ArrayList;

/**
 * 94. Binary Tree Inorder Traversal (Easy)
 * 
 * Given the root of a binary tree, return the inorder traversal of its nodes' values.
 */


public class n94_BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root){
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;

        helper(root, res);
        return res;
    }
    private void helper(TreeNode root, List<Integer> res){
        if (root == null)
            return;
        helper(root.left, res);
        res.add(root.val);
        helper(root.right, res);
    }
}
