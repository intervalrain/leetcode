package com.rainhu;

import com.rainhu.DioUtility.TreeNode;

/**
 * 450. Delete Node in a BST (Medium)
 * 
 * Given a root node reference of a BST and a key,
 * delete the node with the given key in the BST.
 * Return the root node reference (possibly updated) of the BST.
 * 
 * Basically, the deletion can be divided into two stages:
 * 
 *   1. Search for a node to remove.
 *   2. If the node is found, delete the node.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2021/11/24
 * @apiNote: BST
 */

public class n450_DeleteNodeInABST {
    public TreeNode deleteNode(TreeNode root, int key){
        if (root == null) return root;
        if (root.val < key) root.right = deleteNode(root.right, key);
        else if (root.val > key) root.left = deleteNode(root.left, key);
        else {
            if (root.left == null) return root.right;
            else if (root.right == null) return root.left;
            else {
                TreeNode newRoot = root.right, par = null;
                while(newRoot.left != null){
                    par = newRoot;
                    newRoot = newRoot.left;
                }
                if (par == null){
                    newRoot.left = root.left;
                    return newRoot;
                }
                par.left = newRoot.right;
                newRoot.left = root.left;
                newRoot.right = root.right;
                return newRoot;
            }
        }
        return root;

    }


    public static void main(String[] args){

        TreeNode root = TreeNode.arrayToTree(new Integer[]{0});
        int key = 0;
        n450_DeleteNodeInABST clz = new n450_DeleteNodeInABST();
        TreeNode node = clz.deleteNode(root, key);
        System.out.println(node);
    }
}

