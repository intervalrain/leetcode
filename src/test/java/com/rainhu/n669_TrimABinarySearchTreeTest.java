package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.rainhu.ToolUtility.TreeNode;

import org.junit.jupiter.api.Test;

public class n669_TrimABinarySearchTreeTest {
    
    n669_TrimABinarySearchTree clz = new n669_TrimABinarySearchTree();
    TreeNode root;
    int low, high;
    TreeNode expected, actual;

    @Test
    public void test1(){
        root = TreeNode.arrayToTree(new Integer[]{1,0,2});
        low = 1;
        high = 2;
        expected = TreeNode.arrayToTree(new Integer[]{1,null,2});
        actual = clz.trimBST(root, low, high);
        assertTrue(TreeNode.equals(expected, actual));
    }

    @Test
    public void test2(){
        root = TreeNode.arrayToTree(new Integer[]{3,0,4,null,2,null,null,null,null,1});
        low = 1;
        high = 3;
        expected = TreeNode.arrayToTree(new Integer[]{3,2,null,1});
        actual = clz.trimBST(root, low, high);
        assertTrue(TreeNode.equals(expected, actual));
    }

    @Test
    public void test3(){
        root = TreeNode.arrayToTree(new Integer[]{3,1,4,null,2});
        low = 1;
        high = 2;
        expected = TreeNode.arrayToTree(new Integer[]{1,null,2});
        actual = clz.trimBST(root, low, high);
        assertTrue(TreeNode.equals(expected, actual));
    }
}
