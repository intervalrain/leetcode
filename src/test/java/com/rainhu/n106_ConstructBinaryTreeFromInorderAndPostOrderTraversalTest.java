package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.rainhu.util.TreeNode;

import org.junit.jupiter.api.Test;

public class n106_ConstructBinaryTreeFromInorderAndPostOrderTraversalTest {
    
    n106_ConstructBinaryTreeFromInorderAndPostOrderTraversal clz = new n106_ConstructBinaryTreeFromInorderAndPostOrderTraversal();
    int[] inorder;
    int[] postorder;
    TreeNode expected;
    TreeNode actual;

    @Test
    public void test1(){
        inorder = new int[]{9,3,15,20,7};
        postorder = new int[]{9,15,7,20,3};
        expected = TreeNode.arrayToTree(new Integer[]{3,9,20,null,null,15,7});
        actual = clz.buildTree(inorder, postorder);
        assertTrue(TreeNode.equals(expected, actual));
    }

    @Test
    public void test2(){
        inorder = new int[]{-1};
        postorder = new int[]{-1};
        expected = TreeNode.arrayToTree(new Integer[]{-1});
        actual = clz.buildTree(inorder, postorder);
        assertTrue(TreeNode.equals(expected, actual));
    }

    @Test
    public void test3(){
        inorder = new int[]{1,2,3};
        postorder = new int[]{3,2,1};
        expected = TreeNode.arrayToTree(new Integer[]{1,null,2,null,null,null,3});
        actual = clz.buildTree(inorder, postorder);
        assertTrue(TreeNode.equals(expected, actual));
    }

    @Test
    public void test4(){
        inorder = new int[]{1,2,3,4,6,5,7,8};
        postorder = new int[]{1,3,2,6,8,7,5,4};
        expected = TreeNode.arrayToTree(new Integer[]{4,2,5,1,3,6,7,null,null,null,null,null,null,null,8});
        actual = clz.buildTree(inorder, postorder);
        assertTrue(TreeNode.equals(expected, actual));
    }
    
    @Test
    public void test5(){
        inorder = new int[]{1,2,3,4,5,6,7,8,9,10};
        postorder = new int[]{1,3,2,5,7,6,10,9,8,4};
        expected = TreeNode.arrayToTree(new Integer[]{4,2,8,1,3,6,9,null,null,null,null,5,7,null,10});
    }
}