package com.rainhu;

import com.rainhu.util.TreeNode;

/**
 * 968. Binary Tree Cameras (Hard)
 * 
 * You are given the root of a binary tree.
 * We install cameras on the tree nodes where each camera at a nodecan monitor its parent, itself,
 * and its immediate children.
 * Return the minimum number of cameras needed to monitor all nodes of the tree.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/6/18
 * @apiNote: 
 */

public class n968_BinaryTreeCameras {
    enum Camera{
        COVERED, NOT_COVERED, SET;
    }
    public int minCameraCover(TreeNode root){
        int[] res = new int[1];
        return (dfs(root, res) == Camera.NOT_COVERED ? 1 : 0) + res[0];
    }
    public Camera dfs(TreeNode root, int[] res){
        if (root == null)
            return Camera.COVERED;
        Camera left = dfs(root.left, res);
        Camera right = dfs(root.right, res);
        if (left == Camera.NOT_COVERED || right == Camera.NOT_COVERED){
            res[0]++;
            return Camera.SET;
        }
        return left == Camera.SET || right == Camera.SET ? Camera.COVERED : Camera.NOT_COVERED;

    }
    // int res;
    // public int minCameraCover(TreeNode root){
    //     res = 0;
    //     return (dfs(root) < 1 ? 1 : 0) + res;
    // }

    // public int dfs(TreeNode root){
    //     if (root == null) return 2;
    //     int left = dfs(root.left);
    //     int right = dfs(root.right);
    //     if (left == 0 || right == 0){
    //         res++;
    //         return 1;
    //     } 
    //     return left == 1 || right == 1 ? 2 : 0;
    // }
}
/**
 * (1) A node in a tree can be covered by its parent, itself, and its two children.
 * (2) A root can be covered by itself or its two children.
 * (3) A leaf can be covered by its parent or by itself.
 * 
 * If we set a camera at the leaf, the camera can cover the leaf and its parent,
 * but if we set a camera at its parent, the camera can cover the lead, its parent and its sibling.
 * So the second option is better.
 * 
 * Try to set cameras at all leaves' parent.
 * 
 * Greedy solution: 
 *      1. Set cameras on all leaves' parents, then remove all covered nodes.
 *      2. Repeat step 1 until all nodes are covered.
 * 
 * That is to say,
 * Apply a recursion function dfs
 * Return 0 if it's a leaf.
 * Return 1 if it's a parent of a leaf, with a camera on this node.
 * Return 2 if it's covered, without camera on this node.
 * 
 * For each node, 
 * if it has a child, which is a lead(value 0), then it needs camera.
 * if it has a child, which is the parent of a lead(value 1), then it's covered.
 */
 
