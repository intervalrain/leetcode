package com.rainhu;

import com.rainhu.util.TreeNode;

public class n104_MaximumDepthOfBinaryTree {

    public int maxDepth(TreeNode root){
        if(root == null)
            return 0;
        return Math.max(maxDepth(root.left), maxDepth(root.right))+1;
    }
}
