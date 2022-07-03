package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import com.rainhu.util.TreeNode;

import org.junit.jupiter.api.Test;

public class n700_SearchInABinarySearchTreeTest {
    
    n700_SearchInABinarySearchTree clz = new n700_SearchInABinarySearchTree();
    TreeNode root;
    int val;
    TreeNode expected, actual;

    @Test
    public void test1(){
        root = new TreeNode(4,2,7,1,3);
        val = 2;
        expected = new TreeNode(2,1,3);
        actual = clz.searchBST(root, val);
        assertTrue(TreeNode.equals(expected, actual));
    }

    @Test
    public void test2(){
        root = new TreeNode(4,2,7,1,3);
        val = 5;
        expected = null;
        actual = clz.searchBST(root, val);
        assumeTrue(TreeNode.equals(expected, actual));
    }
}
