package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.rainhu.ToolUtility.TreeNode;

import org.junit.jupiter.api.Test;

public class n99_RecoverBinarySearchTreeTest {
    
    n99_RecoverBinarySearchTree clz = new n99_RecoverBinarySearchTree();
    TreeNode root;
    TreeNode expected;

    @Test
    public void test1(){
        root = TreeNode.arrayToTree(new Integer[]{1,3,null,null,2});
        expected = TreeNode.arrayToTree(new Integer[]{3,1,null,null,2});
        clz.recoverTree(root);
        assertTrue(TreeNode.equals(root, expected));
    }

    @Test
    public void test2(){
        root = TreeNode.arrayToTree(new Integer[]{3,1,4,null,null,2});
        expected = TreeNode.arrayToTree(new Integer[]{2,1,4,null,null,3});
        clz.recoverTree(root);
        assertTrue(TreeNode.equals(root, expected));
    }
}
