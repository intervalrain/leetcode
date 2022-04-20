package com.rainhu;

import java.util.Stack;
import com.rainhu.ToolUtility.TreeNode;

/**
 * 173. Binary Search Tree Iterator (Medium)
 * 
 * Implement the BSTIterator class that represents an iterator over the in-order traversal of a binary search tree (BST):
 *      + BSTIterator(TreeNode root) Initializes an object of the BSTIterator class. 
 *        The root of the BST is given as part of the constructor. 
 *        The pointer should be initialized to a non-existent number smaller than any element in the BST.
 *      + boolean hasNext() Returns true if there exists a number in the traversal to the right of the pointer, 
 *        otherwise returns false.
 *      + int next() Moves the pointer to the right, then returns the number at the pointer.
 * 
 * Notice that by initializing the pointer to a non-existent smallest number,
 * the first call to next() will return the smallest element in the BST.
 * 
 * You may assume that next() calls will always be valid. That is, 
 * there will be at least a next number in the in-order traversal when next() is called.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/4/21
 * @apiNote: Stack
 */

public class n173_BinarySearchTreeIterator {
    Stack<TreeNode> q = new Stack<>();
    public n173_BinarySearchTreeIterator(TreeNode root){
        pushLeft(root);
    }
    private void pushLeft(TreeNode root){
        while (root != null){
            q.push(root);
            root = root.left;
        }
    }
    public int next(){
        TreeNode node = q.pop();
        pushLeft(node.right);
        return node.val;
    }
    public boolean hasNext(){
        return !q.isEmpty();
    }
}
