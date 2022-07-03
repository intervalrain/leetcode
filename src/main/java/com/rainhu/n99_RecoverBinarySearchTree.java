package com.rainhu;

import com.rainhu.util.TreeNode;

/**
 * 99. Recover Binary Search Tree (Medium)
 * 
 * You are given the root of a binary search tree (BST), 
 * where the values of exactly two nodes of the tree were swapped by mistake. 
 * Recover the tree without changing its structure.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/4/19
 * @apiNote:
 */

public class n99_RecoverBinarySearchTree {
    TreeNode first = null;
    TreeNode second = null;
    TreeNode prev = null;
    public void recoverTree(TreeNode root){
        traverse(root);
        swap(first, second);
    }
    // 52341
    // ^   ^

    public void traverse(TreeNode root){
        if (root == null) return;
        traverse(root.left);

        if (prev != null){
            if (first == null && prev.val >= root.val){
                first = prev;
            }
        }
        if (first != null && prev.val >= root.val){
            second = root;
        }
        prev = root;
        traverse(root.right);
    }
    public void swap(TreeNode a, TreeNode b){
        int tmp = a.val;
        a.val = b.val;
        b.val = tmp;
    }
}
