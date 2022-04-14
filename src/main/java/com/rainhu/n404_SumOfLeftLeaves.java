package com.rainhu;

import com.rainhu.ToolUtility.TreeNode;

/**
 * 404. Sum of Left Leaves (Easy)
 * 
 * Given the root of a binary tree, return the sum of all left leaves.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2021/11/5
 * @apiNote: pass a isLeft boolean to helper
 */

public class n404_SumOfLeftLeaves {

    public int sumOfleftLeaves(TreeNode root){
        return sumUp(root, false);
    }

    public int sumUp(TreeNode node, boolean isLeft){
        if (node == null) return 0;
        if (node.left == null && node.right == null){
            if (isLeft)
                return node.val;
            else
                return 0;
        } else {
            return sumUp(node.left, true) + sumUp(node.right, false);
        }
        
    }
}
