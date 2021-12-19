package com.rainhu;

/**
 * 108. Convert Sorted Array to Binary Search Tree (Easy)
 * 
 * Given an integer array nums where the elements are sorted in ascending order,
 * convert it to a height-balanced binary search tree.
 * 
 * A height-balanced binary tree is a binary tree in which the depth of the two subtrees of every node never differs by more than one.
 */

import com.rainhu.DioUtility.TreeNode;

public class n108_ConvertSortedArrayToBinarySearchTree {

    public TreeNode sortedArrayToBST(int[] nums){
        if (nums.length == 0)
            return null;
        return helper(nums, 0, nums.length-1);
    }
    private TreeNode helper(int[] nums, int left, int right){
        if(left>right)
            return null;
        int mid = left + ((right - left) >> 1);
        TreeNode node = new TreeNode(nums[mid]);
        node.left = helper(nums, left, mid-1);
        node.right = helper(nums, mid+1, right);
        return node;
    }
}
