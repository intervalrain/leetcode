package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.rainhu.DioUtility.TreeNode;

import org.junit.jupiter.api.Test;

public class n450_DeleteNodeInABSTTest{

    n450_DeleteNodeInABST clz = new n450_DeleteNodeInABST();
    TreeNode root;
    int key;
    TreeNode expected;
    TreeNode actual;

    @Test
    public void test1(){
        root = TreeNode.arrayToTree(new Integer[]{5,3,6,2,4,null,7});
        key = 3;
        expected = TreeNode.arrayToTree(new Integer[]{5,4,6,2,null,null,7});
        actual = clz.deleteNode(root, key);
        assertTrue(TreeNode.equals(expected, actual));
    }

    @Test
    public void test2(){
        root = TreeNode.arrayToTree(new Integer[]{5,3,6,2,4,null,7});
        key = 0;
        expected = TreeNode.arrayToTree(new Integer[]{5,3,6,2,4,null,7});
        actual = clz.deleteNode(root, key);
        assertTrue(TreeNode.equals(expected, actual));
    }

    @Test
    public void test3(){
        root = TreeNode.arrayToTree(new Integer[]{});
        key = 0;
        expected = null;
        actual = clz.deleteNode(root, key);
        assertTrue(TreeNode.equals(expected, actual));
    }

    @Test
    public void test4(){
        root = TreeNode.arrayToTree(new Integer[]{0});
        key = 0;
        expected = null;
        actual = clz.deleteNode(root, key);
        assertTrue(TreeNode.equals(expected, actual));
    }
}