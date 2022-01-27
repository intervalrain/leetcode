package com.rainhu;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.rainhu.DioUtility.TreeNode;

/**
 * 1305. All Elements in Two Binary Search Trees
 * 
 * Given two binary search trees root1 and root2,
 * return a list containing all the integers from both trees sorted in ascending order.
 * 
 * @author: Rain Hu
 * @version: 2
 * @since: 2022/1/26
 * @apiNote: dfs
 */

public class n1305_AllElementsInTwoBinarySearchTrees{
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        Queue<Integer> q = new LinkedList<>();
        List<Integer> res = new ArrayList<>();

        dfs(root1, q);
        dfs2(root2, res, q);

        if (!q.isEmpty())
            res.addAll(q);

        return res;
    }

    private void dfs(TreeNode root, Queue<Integer> q){
        if (root == null)
            return;
        if (root.left != null)
            dfs(root.left, q);
        q.add(root.val);
        if (root.right != null)
            dfs(root.right, q);
    }

    private void dfs2(TreeNode root, List<Integer> list, Queue<Integer> q){
        if (root == null)
            return;
        if (root.left != null)
            dfs2(root.left, list, q);
        while (!q.isEmpty() && q.peek() < root.val)
            list.add(q.poll());
        list.add(root.val);
        if (root.right != null)
            dfs2(root.right, list, q);
    }
}
