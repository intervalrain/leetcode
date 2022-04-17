package com.rainhu;

import java.util.Stack;

import com.rainhu.ToolUtility.TreeNode;

/**
 * 897. Increasing Order Search Tree (Easy)
 * 
 * Given the root of a binary search tree, 
 * rearrange the tree in in-order so that the leftmost node in the tree is now the root of the tree, 
 * and every node has no left child and only one right child.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/4/17
 * @apiNote: Tree
 */

public class n897_IncreasingOrderSearchTree {
    public TreeNode increasingBST(TreeNode root) {
        Stack<Integer> st = new Stack<>();
        traverse(root, st);
        TreeNode curr = new TreeNode(st.pop());
        while (!st.isEmpty()){
            curr = new TreeNode(st.pop(), null, curr);
        }
        return curr;
    }
    public void traverse(TreeNode root, Stack<Integer> st){
        if (root == null) return;
        traverse(root.left, st);
        st.add(root.val);
        traverse(root.right, st);
    }
}
