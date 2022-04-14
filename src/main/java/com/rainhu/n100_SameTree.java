package com.rainhu;

import com.rainhu.ToolUtility.TreeNode;

public class n100_SameTree {

    public boolean isSameTree(TreeNode p, TreeNode q){
        if(p==null && q==null)
            return true;
        if(p==null || q==null || p.val != q.val)
            return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
