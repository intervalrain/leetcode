package com.rainhu;

import com.rainhu.ToolUtility.TreeNode;

/**
 * 700. Search In a Binary Search Tree (Easy)
 * 
 * You are given the root of a binary search tree(BST) and an integer val.
 * Find the node in the BST that the nodes's value equals val and return the subtree rooted with that node.
 * If such a node does not exist, return null
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/4/15
 * @apiNote: BST
 */

public class n700_SearchInABinarySearchTree {
    public TreeNode searchBST(TreeNode root, int val){
        if (root == null) return null;
        if (root.val == val) return root;
        if (val > root.val) return searchBST(root.right, val);
        return searchBST(root.left, val);
    }
}
