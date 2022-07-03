package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.rainhu.util.TreeNode;

import org.junit.jupiter.api.Test;

public class n938_RangeSumOfBSTTest {
    
    n938_RangeSumOfBST clz = new n938_RangeSumOfBST();
    TreeNode root;
    int low;
    int high;
    int expected;
    int actual;

    @Test
    public void test1(){
        root = TreeNode.arrayToTree(new Integer[]{10,5,15,3,7,null,18});
        low = 7;
        high = 15;
        expected = 32;
        actual = clz.rangeSumBST(root, low, high);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        root = TreeNode.arrayToTree(new Integer[]{10,5,15,3,7,13,18,1,null,6});
        low = 6;
        high = 10;
        expected = 23;
        actual = clz.rangeSumBST(root, low, high);
        assertEquals(expected, actual);
    }
}
