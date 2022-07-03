package com.rainhu;

import java.util.List;

import com.rainhu.util.TreeNode;

import java.util.ArrayList;

/**
 * 144. Binary Tree Postorder Traversal (Easy)
 * 
 * Given the root of a binary tree, return the postorder traversal of its nodes' values.
 */

public class n145_BinaryTreePostorderTraversal {

    public List<Integer> postorderTraversal(TreeNode root){
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;

        helper(root, res);
        return res;
    }
    private void helper(TreeNode root, List<Integer> res){
        if (root == null)
            return;
        helper(root.left, res);
        helper(root.right, res);
        res.add(root.val);
    }
}
