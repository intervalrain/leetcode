package com.rainhu;

/**
 * 100. Same Tree (Easy)
 * 
 * Given the roots of two binary trees p and q,
 * write a function to check if they are the same or not.
 * 
 * Two binary trees are considered the same if they are stucturally identical,
 * and the nodes have the same value.
 */

import com.rainhu.DioUtility.TreeNode;

public class n100_SameTree {

    public boolean isSameTree(TreeNode p, TreeNode q){
        if(p==null && q==null)
            return true;
        if(p==null || q==null || p.val != q.val)
            return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
