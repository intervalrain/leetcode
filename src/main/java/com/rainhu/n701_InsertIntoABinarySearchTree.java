package com.rainhu;

import com.rainhu.ToolUtility.TreeNode;

/**
 * 701. Insert Into a Binary Search Tree (Median)
 * You are given the root node of a binary search tree (BST) and a value to insert into the tree. 
 * Return the root node of the BST after the insertion. 
 * It is guaranteed that the new value does not exist in the original BST.
 * 
 * Notice that there may exist multiple valid ways for the insertion, as long as the tree remains a BST after insertion. You can return any of them.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/1/13
 * @apiNote: 
 */

public class n701_InsertIntoABinarySearchTree {
    public TreeNode insertIntoBST(TreeNode root, int val){
        if (root == null) return new TreeNode(val);
        TreeNode curr = root;
        TreeNode papa = null;
        boolean left = true;
        while (curr != null){
            papa = curr;
            if (val > curr.val){
                curr = curr.right;
                left = false;
            } else {
                curr = curr.left;
                left = true;
            }
        }
        curr = new TreeNode(val);
        if (left){
            papa.left = curr;
        } else {
            papa.right = curr;
        }

        return root;
    }
}
