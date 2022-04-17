package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.rainhu.ToolUtility.TreeNode;

import org.junit.jupiter.api.Test;

public class n897_IncreasingOrderSearchTreeTest {
        
    n897_IncreasingOrderSearchTree clz = new n897_IncreasingOrderSearchTree();
    TreeNode root, expected, actual;

    @Test
    public void test1(){
        root = TreeNode.arrayToTree(new Integer[]{5,3,6,2,4,null,8,1,null,null,null,null,null,7,9});
        expected = TreeNode.arrayToTreeInRightSubtreeOnly(new Integer[]{1,2,3,4,5,6,7,8,9});
        actual = clz.increasingBST(root);
        assertTrue(TreeNode.equals(expected, actual));
    }

    @Test
    public void test2(){
        root = TreeNode.arrayToTree(new Integer[]{5,1,7});
        expected = TreeNode.arrayToTreeInRightSubtreeOnly(new Integer[]{1,5,7});
        actual = clz.increasingBST(root);
        assertTrue(TreeNode.equals(expected, actual));
    }
}
