package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.rainhu.ToolUtility.TreeNode;

import org.junit.jupiter.api.Test;

public class n538_ConvertBSTtoGreaterTreeTest {
    
    n538_ConvertBSTtoGreaterTree clz = new n538_ConvertBSTtoGreaterTree();
    TreeNode root, expected, actual;

    @Test
    public void test1(){
        root = TreeNode.arrayToTree(new Integer[]{4,1,6,0,2,5,7,null,null,null,3,null,null,null,8});
        expected = TreeNode.arrayToTree(new Integer[]{30,36,21,36,35,26,15,null,null,null,33,null,null,null,8});
        actual = clz.convertBST(root);
        assertTrue(TreeNode.equals(expected, actual));
    }

    @Test
    public void test2(){
        root = TreeNode.arrayToTree(new Integer[]{0,null,1});
        expected = TreeNode.arrayToTree(new Integer[]{1,null,1});
        actual = clz.convertBST(root);
        assertTrue(TreeNode.equals(expected, actual));
    }
}
