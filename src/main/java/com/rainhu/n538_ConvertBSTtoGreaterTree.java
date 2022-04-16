package com.rainhu;

import com.rainhu.ToolUtility.TreeNode;

/**
 * 538. Convert BST to Greater Tree (Medium)
 * 
 * Given the root of a Binary Search Tree (BST),
 * convert it to a Greater Tree such that every key of the original BST is changed to the original key plus the sum of all keys greater than the original key in BST.
 * 
 * As a reminder, a binary search tree is a tree that satisfies these constraints:
 *      + The left subtree of a node contains only nodes with keys less than the node's key.
 *      + The right subtree of a node contains only nodes with keys greater than the node's key.
 *      + Both the left and right sub trees must also be binary search trees.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/4/16
 * @apiNote: Traverse inorder reversely
 */

public class n538_ConvertBSTtoGreaterTree {
    int max;
    public TreeNode convertBST(TreeNode root){
        max = 0;
        traverse(root);
        return root;
    }
    public void traverse(TreeNode root){
        if (root == null) return;
        traverse(root.right);
        root.val += max;
        max = root.val;
        traverse(root.left);
    }

    
}
