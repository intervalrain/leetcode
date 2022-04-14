package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.rainhu.ToolUtility.TreeNode;

import org.junit.jupiter.api.Test;

public class n111_MinimumDepthOfBinaryTreeTest {
    
    n111_MinimumDepthOfBinaryTree clz = new n111_MinimumDepthOfBinaryTree();
    Integer[] array;
    TreeNode root;
    int expected;
    int actual;

    @Test
    public void test1(){
        array = new Integer[]{3,9,20,null,null,15,7};
        root = TreeNode.arrayToTree(array);
        expected = 2;
        actual =clz.minDepth(root);
        assertEquals(expected, actual);
    }
}
