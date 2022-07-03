package com.rainhu;

import com.rainhu.util.TreeNode;

/**
 * 1302. Deepest Leaves Sum (Medium)
 * 
 * Given the root of a binary tree,
 * return the sum of values of its deepest leaves.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/5/15
 * @apiNote:
 */

public class n1302_DeepestLeavesSum {
    int[] map = new int[21];
    int ptr = 0;
    public int deepestLeavesSum(TreeNode root) {
        traverse(root, 1);
        return map[ptr];
    }
    public void traverse(TreeNode root, int level){
        map[level] += root.val;
        if (level > ptr) ptr = level;
        if (root.left != null) traverse(root.left, level+1);
        if (root.right != null) traverse(root.right, level+1);
    }
}
