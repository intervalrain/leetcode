package com.rainhu;

import com.rainhu.DioUtility.TreeNode;

/**
 * 106. Construct Binary Tree from Inorder and Postorder Traversal (Medium)
 * 
 * Given two integer arrays inoder and postorder where
 * inorder is the inorder traversal of a binary tree and 
 * postorder is the postorder traversal of the same tree,
 * constuct and return the binary tree.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2021/11/21
 * @apiNote: 
 */

public class n106_ConstructBinaryTreeFromInorderAndPostOrderTraversal {
    
    int cntInorder;
    int cntPostorder;
    public TreeNode buildTree(int[] inorder, int[] postorder){
        cntInorder = inorder.length - 1;
        cntPostorder = postorder.length - 1;
        return buildTreeSub(inorder, postorder, null);
    }
    public TreeNode buildTreeSub(int[] inorder, int[] postorder, TreeNode root){
        if (cntPostorder < 0) return null;
        TreeNode node = new TreeNode(postorder[cntPostorder--]);
        if (inorder[cntInorder] != node.val){
            node.right = buildTreeSub(inorder, postorder, node);
        }
        cntInorder--;
        if (root == null || inorder[cntInorder] != root.val){
            node.left = buildTreeSub(inorder, postorder, root);
        }
        return node;
    }
        
}



// int pInorder;
//     int pPostorder;
    
//     public TreeNode buildTree(int[] inorder, int[] postorder){
//         pInorder = inorder.length - 1;
//         pPostorder = postorder.length - 1;

//         return buildTree(inorder, postorder, null);
//     }

//     public TreeNode buildTree(int[] inorder, int[] postorder, TreeNode root){
//         if (pPostorder < 0) return null;
//         TreeNode n = new TreeNode(postorder[pPostorder--]);

//         if (inorder[pInorder] != n.val){
//             n.right = buildTree(inorder, postorder, n);
//         }
        
//         pInorder--;

//         if ((root == null) || (inorder[pInorder] != root.val)){
//             n.left = buildTree(inorder, postorder, root);
//         }

//         return n;
//     }

