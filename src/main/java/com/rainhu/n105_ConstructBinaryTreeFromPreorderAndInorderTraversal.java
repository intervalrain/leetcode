package com.rainhu;

import java.util.LinkedList;
import java.util.Queue;

import com.rainhu.ToolUtility.TreeNode;

public class n105_ConstructBinaryTreeFromPreorderAndInorderTraversal {
    Queue<Integer> q;
    
    public TreeNode buildTree(int[] preorder, int[] inorder){
        q = new LinkedList<>();
        for (int i = 0; i < preorder.length; i++){
            q.offer(preorder[i]);
        }
        return build(inorder, 0, inorder.length-1);
    }

    private TreeNode build(int[] inorder, int left, int right){
        if (left == right){
            q.remove(inorder[left]);
            return new TreeNode(inorder[left]);
        } else if (left > right){
            return null;
        }
        int mid = q.poll();
        int i;
        TreeNode root = new TreeNode(mid);
        for (i = right; i >= left; i--)
            if (inorder[i] == mid) break;
        root.left = build(inorder, left, i-1);
        root.right = build(inorder, i+1, right);
        return root;
    }
}
