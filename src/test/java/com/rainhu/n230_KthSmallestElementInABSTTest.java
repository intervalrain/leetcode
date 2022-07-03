package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.rainhu.util.TreeNode;

import org.junit.jupiter.api.Test;

public class n230_KthSmallestElementInABSTTest {
    
    n230_KthSmallestElementInABST clz = new n230_KthSmallestElementInABST();
    TreeNode root;
    int k;
    int expected, actual;

    @Test
    public void test1(){
        root = TreeNode.arrayToTree(new Integer[]{3,1,4,null,2});
        k = 1;
        expected = 1;
        actual = clz.kthSmallest(root, k);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        root = TreeNode.arrayToTree(new Integer[]{5,3,6,2,4,null,null,1});
        k = 3;
        expected = 3;
        actual = clz.kthSmallest(root, k);
        assertEquals(expected, actual);
    }
}
