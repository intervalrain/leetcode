package com.rainhu;

/**
 * 101. Symmetric Tree (Easy)
 * 
 * Given the root of a binary tree,
 * check whether it is a mirror of itself(i.e., symmetric around its center)
 */

import com.rainhu.DioUtility.TreeNode;

public class n101_SymmetricTree {

    public boolean isSymmetric(TreeNode root){
        return helper(root.left, root.right);
    }
    private boolean helper(TreeNode left, TreeNode right){
        if(left == null && right == null)
            return true;
        if(left == null || right == null)
            return false;
        return helper(left.left, right.right) && helper(left.right, right.left) && left.val == right.val;
    }
}
