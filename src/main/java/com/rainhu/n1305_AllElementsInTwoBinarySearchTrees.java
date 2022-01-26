package com.rainhu;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.rainhu.DioUtility.TreeNode;

/**
 * 1305. All Elements in Two Binary Search Trees
 * 
 * Given two binary search trees root1 and root2,
 * return a list containing all the integers from both trees sorted in ascending order.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/1/26
 * @apiNote: Tree
 */

public class n1305_AllElementsInTwoBinarySearchTrees{
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        LinkedList<Integer> ret = new LinkedList<>();
        List<Integer> ret2 = new ArrayList<>();
        
        dfs(root1, ret);
        dfs2(root2, ret2, ret);
        
        if (ret.size() > 0)
            ret2.addAll(ret);
        return ret2;
    }
    
    private void dfs(TreeNode node, LinkedList<Integer> ret) {
        if (node == null)
            return;
        if (node.left != null)
            dfs(node.left, ret);
        ret.add(node.val);
        if (node.right != null)
            dfs(node.right, ret);
    }
    
    private void dfs2(TreeNode node, List<Integer> ret, LinkedList<Integer> ex) {
        if (node == null)
            return;
        if (node.left != null)
            dfs2(node.left, ret, ex);
        while (!ex.isEmpty() && ex.peekFirst() < node.val)
            ret.add(ex.pollFirst());
        ret.add(node.val);
        if (node.right != null)
            dfs2(node.right, ret, ex);
    }
}
