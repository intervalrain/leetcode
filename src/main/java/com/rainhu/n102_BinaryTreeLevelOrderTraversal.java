package com.rainhu;

import java.util.ArrayList;
import java.util.List;
import com.rainhu.util.TreeNode;

/**
 * 102. Binary Tree Level Order Traversal
 * 
 * Given the root of binary tree,
 * return the level order traversal of its nodes' values.
 * (i.e., from left to right, level by level)
 * 
 * @author: Rain Hu
 * @version: 2
 * @since: 2022/7/13
 * @apiNote: Tree
 */

public class n102_BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> res = new ArrayList<>();
        traverse(root, res, 0);
        return res;
    }

    public void traverse(TreeNode root, List<List<Integer>> list, int level){
        if (root == null) return;
        if (list.size() == level){
            list.add(new ArrayList<>());
        }
        traverse(root.left, list, level+1);
        list.get(level).add(root.val);
        traverse(root.right, list, level+1);
    }
}
