package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.rainhu.ToolUtility.TreeNode;

import org.junit.jupiter.api.Test;

public class n124_BinaryTreeMaximumPathSumTest {
    
    n124_BinaryTreeMaximumPathSum clz = new n124_BinaryTreeMaximumPathSum();
    TreeNode root;
    int expected, actual;

    @Test
    public void test1(){
        root = new TreeNode(1,2,3);
        expected = 6;
        actual = clz.maxPathSum(root);
        assertEquals(expected, actual);
    }
    
    @Test
    public void test2(){
        root = new TreeNode(-10, 9, 20, 0, 0, 15, 7);
        expected = 42;
        actual = clz.maxPathSum(root);
        assertEquals(expected, actual);
    }
}
