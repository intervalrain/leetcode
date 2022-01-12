package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.rainhu.DioUtility.TreeNode;

import org.junit.jupiter.api.Test;

public class n701_InsertIntoABinarySearchTreeTest {
    
    n701_InsertIntoABinarySearchTree clz = new n701_InsertIntoABinarySearchTree();
    TreeNode root;
    int val;
    TreeNode expected;
    TreeNode actual;

    @Test
    public void test1(){
        TreeNode root = TreeNode.arrayToTree(new Integer[]{4,2,7,1,3});
        val = 5;
        expected = TreeNode.arrayToTree(new Integer[]{4,2,7,1,3,5});
        actual = clz.insertIntoBST(root, val);
        assertTrue(expected.toString().equals(actual.toString()));
    }

    @Test
    public void test2(){
        TreeNode root = TreeNode.arrayToTree(new Integer[]{40,20,60,10,30,50,70});
        val = 25;
        expected = TreeNode.arrayToTree(new Integer[]{40,20,60,10,30,50,70,null,null,25});
        actual = clz.insertIntoBST(root, val);
        assertTrue(expected.toString().equals(actual.toString()));
    }

    @Test
    public void test3(){
        TreeNode root = TreeNode.arrayToTree(new Integer[]{4,2,7,1,3,null,null,null,null,null,null});
        val = 5;
        expected = TreeNode.arrayToTree(new Integer[]{4,2,7,1,3,5});
        actual = clz.insertIntoBST(root, val);
        assertTrue(expected.toString().equals(actual.toString()));
    }

    @Test
    public void test4(){
        TreeNode root = TreeNode.arrayToTree(new Integer[]{});
        val = 5;
        expected = TreeNode.arrayToTree(new Integer[]{5});
        actual = clz.insertIntoBST(root, val);
        assertTrue(expected.toString().equals(actual.toString()));
    }
}
