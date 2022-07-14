package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.rainhu.util.Snippet;
import com.rainhu.util.TreeNode;

import org.junit.jupiter.api.Test;

public class n105_ConstructBinaryTreeFromPreorderAndInorderTraversalTest {
    
    n105_ConstructBinaryTreeFromPreorderAndInorderTraversal clz = new n105_ConstructBinaryTreeFromPreorderAndInorderTraversal();
    int[] preorder, inorder;
    TreeNode expected, actual;

    @Test
    public void test1(){
        preorder = Snippet.stringToIntegerArray("[3,9,20,15,7]");
        inorder = Snippet.stringToIntegerArray("[9,3,15,20,7]");
        expected = Snippet.stringToTreeNode("[3,9,20,null,null,15,7]");
        actual = clz.buildTree(preorder, inorder);
        assertTrue(TreeNode.equals(expected, actual));
    }

    @Test
    public void test2(){
        preorder = Snippet.stringToIntegerArray("[-1]");
        inorder = Snippet.stringToIntegerArray("[-1]");
        expected = Snippet.stringToTreeNode("[-1]");
        actual = clz.buildTree(preorder, inorder);
        assertTrue(TreeNode.equals(expected, actual));
    }

    @Test
    public void test3(){
        preorder = Snippet.stringToIntegerArray("[1,2]");
        inorder = Snippet.stringToIntegerArray("[2,1]");
        expected = Snippet.stringToTreeNode("[1,2]");
        actual = clz.buildTree(preorder, inorder);
        assertTrue(TreeNode.equals(expected, actual));
    }
}
