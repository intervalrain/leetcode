package com.rainhu;

import com.rainhu.ToolUtility.TreeNode;

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
