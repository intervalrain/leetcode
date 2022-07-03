package com.rainhu;

import java.util.List;

import com.rainhu.util.TreeNode;

import java.util.ArrayList;

/**
 * 144. Binary Tree Preorder Traversal (Easy)
 * 
 * Given the root of a binary tree, return the preorder traversal of its nodes' values.
 */

public class n144_BinaryTreePreorderTraversal {

    public List<Integer> preorderTraversal(TreeNode root){
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;

        helper(root, res);
        return res;
    }
    private void helper(TreeNode root, List<Integer> res){
        if (root == null)
            return;
        res.add(root.val);
        helper(root.left, res);
        helper(root.right, res);
    }
}
