package com.rainhu;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

import com.rainhu.ToolUtility.TreeNode;

/**
 * 230. Kth Smallest Element in a BST (medium)
 * Given the root of a binary search tree,
 * and an integer k,
 * return the kth smallest value (1-indexed) of all the values of the nodes in the tree.
 * 
 * @author: Rain Hu
 * @version: 2
 * @since: 2022/4/19
 * @apiNote: BST
 */

public class n230_KthSmallestElementInABST {
    public int kthSmallest2(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        traverse(root, list);
        Collections.sort(list);
        return list.get(k - 1);
    }

    public void traverse(TreeNode root, List<Integer> list){
        if (root == null) return;
        traverse(root.left, list);
        list.add(root.val);
        traverse(root.right, list);
    }

    int cnt;
    int res;
    public int kthSmallest(TreeNode root, int k) {
        cnt = k;
        run(root);
        return res;
    }

    public void run(TreeNode root){
        if (root == null) return;
        run(root.left);
        cnt--;
        if (cnt == 0) {
            res = root.val;
            return;
        }
        run(root.right);
    }
}
