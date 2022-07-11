package com.rainhu;

import com.rainhu.util.TreeNode;
import java.util.List;
import java.util.ArrayDeque;
import java.util.ArrayList;

/**
 * 199. Binary Tree Right Side View (Medium)
 * Given the root of a binary tree, 
 * imagine yourself standing on the right side of it, 
 * return the values of the nodes you can see ordered from top to bottom.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/7/12
 * @apiNote: tree
 */

public class n199_BinaryTreeRightSideView {
    public List<Integer> rightSideView(TreeNode root){
        List<ArrayDeque<Integer>> qList = new ArrayList<>();
        traverse(root, qList, 0);
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < qList.size(); i++){
            res.add(qList.get(i).peekLast());
        }
        return res;

    }

    public void traverse(TreeNode root, List<ArrayDeque<Integer>> qList, int level){
        if (root == null) return;
        if (level >= qList.size()){
            qList.add(new ArrayDeque<>());
        }
        ArrayDeque<Integer> dq = qList.get(level);
        traverse(root.left, qList, level+1);
        dq.offer(root.val);
        traverse(root.right, qList, level+1);
    }
}
