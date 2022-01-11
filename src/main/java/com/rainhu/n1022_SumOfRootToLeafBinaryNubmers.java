package com.rainhu;

import com.rainhu.DioUtility.TreeNode;

/**
 * 1022. Sum of Root To Leaf Binary Numbers (Easy)
 * 
 * You are given the root of binary tree where each node has a value 0 or 1.
 * Each root-to-leaf path represents a binary number starting with the most significant bit.
 *     + For example, if the path is 0 -> 1 -> 1 -> 0 -> 1,
 *       then this cuold represent 01101 in binary, which is 13.
 * For all leaves in the tree, consider the numbers represented by the path from the root the that leaf.
 * Return the sum of these numbers.
 * The test cases are generated so taht the answer fits in a 32-bits integer.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/1/12
 * @apiNote: 
 */

public class n1022_SumOfRootToLeafBinaryNubmers {
    public int sumRootToLeaf(TreeNode root){
        return addUp(root, 0);
    }
    private int addUp(TreeNode root, int curr){
        if (root.left == null && root.right == null)
            return curr * 2 + root.val;
        else if (root.left != null && root.right == null)
            return addUp(root.left, curr * 2 + root.val);
        else if (root.right != null && root.left == null)
            return addUp(root.right, curr * 2 + root.val);
        return addUp(root.left, curr * 2 + root.val) + addUp(root.right, curr * 2 + root.val);
    }
}
