package com.rainhu;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.HashMap;
import com.rainhu.util.TreeNode;

/**
 * 105. Construct Binary Tree from Preorder and Inorder Traversal (Medium)
 * 
 * Given two integer array preorder and inorder where preorder is the preorder traversal of a binary tree and inorder is the inorder is the inorder traversal of the same tree,
 * construct and return the binary tree.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/7/14
 * @apiNote: tree
 */

public class n105_ConstructBinaryTreeFromPreorderAndInorderTraversal {
    
    public TreeNode buildTree(int[] preorder, int[] inorder){
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] idx = new int[]{0};
        for (int i = 0; i < inorder.length; i++){
            map.put(inorder[i], i);
        }
        return build(preorder, idx, inorder, 0, inorder.length - 1, map);
    }
    
    private TreeNode build(int[] preorder, int[] idx, int[] inorder, int left, int right, HashMap<Integer,Integer> map){
        if (left > right){
            return null;
        }
        if (left == right){
            return new TreeNode(preorder[idx[0]++]);
        }
        int mid = map.get(preorder[idx[0]]);
        TreeNode root = new TreeNode(preorder[idx[0]++]);
        root.left = build(preorder, idx, inorder, left, mid - 1, map);
        root.right = build(preorder, idx, inorder, mid + 1, right, map);
        return root;
    }
    
    
}
