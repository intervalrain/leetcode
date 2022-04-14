package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.rainhu.ToolUtility.TreeNode;

import org.junit.jupiter.api.Test;

public class n110_BalancedBinaryTreeTest{

    n110_BalancedBinaryTree clz = new n110_BalancedBinaryTree();
    Integer[] array;
    TreeNode root;
    boolean expected;
    boolean actual;

    @Test
    public void test1(){
        array = new Integer[]{3,9,20,null,null,15,7};
        root = TreeNode.arrayToTree(array);
        expected = true;
        actual = clz.isBalanced(root);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        array = new Integer[]{1,2,2,3,3,null,null,4,4};
        root = TreeNode.arrayToTree(array);
        expected = false;
        actual = clz.isBalanced(root);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        array = new Integer[]{};
        root = TreeNode.arrayToTree(array);
        expected = true;
        actual = clz.isBalanced(root);
        assertEquals(expected, actual);
    }

    @Test
    public void test4(){
        array = new Integer[]{1,2,2,3,null,null,3,4,null,null,4};
        root = TreeNode.arrayToTree(array);
        expected = false;
        actual = clz.isBalanced(root);
        assertEquals(expected, actual);
    }

}