package com.rainhu;

import com.rainhu.DioUtility.TreeNode;

/**
 * 938. Range Sum of BST (Easy)
 * 
 * Given the root node of a binary search tree and two integers low and high,
 * return the sum of values of all nodes with a value in the inclusive range [low, high].
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2021/12/14
 * @apiNote
 */

public class n938_RangeSumOfBST {
    int L;
    int H;
    int total;
    public int rangeSumBST(TreeNode root, int low, int high){
        L = low;
        H = high;
        total = 0;
        sum(root);
        return total;
    }

    private void sum(TreeNode root){
        if (root == null) return;
        if (root.val >= L && root.val <= H)
            total += root.val;
        sum(root.left);
        sum(root.right);
    }
}

