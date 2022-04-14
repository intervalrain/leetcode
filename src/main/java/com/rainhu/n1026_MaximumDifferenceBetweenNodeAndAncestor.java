package com.rainhu;

import com.rainhu.ToolUtility.TreeNode;

/**
 * 1026. Maximum Difference Between Node and Ancestor (Medium)
 * 
 * Given the root of a binary tree, 
 * find the maximum value v for which there exist different nodes a and b where v = |a.val - b.val| and a is an ancestor of b.
 * 
 * A node a is an ancestor of b if either: any child of a is equal to b or any child of a is an ancestor of b.
 */

public class n1026_MaximumDifferenceBetweenNodeAndAncestor{
    int maxDiff;
    public int maxAncestorDiff(TreeNode root) {
        if (root == null) return 0;
        maxDiff = 0;
        if (root.left != null) helper(root, root.left, 0, 0);
        if (root.right != null) helper(root, root.right, 0, 0);
        return maxDiff;
    }

    public void helper(TreeNode root, TreeNode child, int pos, int neg){
        if (root.val - child.val + pos > 0)
            pos += root.val - child.val;
        else
            pos = 0;
        
        if (root.val - child.val + neg < 0)
            neg += root.val - child.val;
        else
            neg = 0;
        maxDiff = Math.max(Math.max(pos, maxDiff), Math.max(-neg, maxDiff));

        if (child.left != null) helper(child, child.left, pos, neg);
        if (child.right != null) helper(child, child.right, pos, neg);
    }
}