package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.rainhu.util.TreeNode;

import org.junit.jupiter.api.Test;

public class n105_ConstructBinaryTreeFromPreorderAndInorderTraversalTest {
    
    n105_ConstructBinaryTreeFromPreorderAndInorderTraversal clz = new n105_ConstructBinaryTreeFromPreorderAndInorderTraversal();
    int[] preorder, inorder;
    TreeNode expected, actual;

    @Test
    public void test1(){
        preorder = new int[]{3,9,20,15,7};
        inorder = new int[]{9,3,15,20,7};
        expected = TreeNode.arrayToTree(new Integer[]{3,9,20,null,null,15,7});
        actual = clz.buildTree(preorder, inorder);
        assertTrue(TreeNode.equals(expected, actual));
    }

    @Test
    public void test2(){
        preorder = new int[]{-1};
        inorder = new int[]{-1};
        expected = TreeNode.arrayToTree(new Integer[]{-1});
        actual = clz.buildTree(preorder, inorder);
        assertTrue(TreeNode.equals(expected, actual));
    }

    @Test
    public void test3(){
        preorder = new int[]{1,2};
        inorder = new int[]{2,1};
        expected = TreeNode.arrayToTree(new Integer[]{1,2});
        actual = clz.buildTree(preorder, inorder);
        assertTrue(TreeNode.equals(expected, actual));
    }
}
