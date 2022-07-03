package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.rainhu.util.TreeNode;

import org.junit.jupiter.api.Test;

public class n563_BinaryTreeTiltTest {
    
    n563_BinaryTreeTilt clz = new n563_BinaryTreeTilt();
    TreeNode root;
    int expected;
    int actual;

    @Test
    public void test1(){
        root = TreeNode.arrayToTree(new Integer[]{1,2,3});
        expected = 1;
        actual = clz.findTilt(root);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        root = TreeNode.arrayToTree(new Integer[]{4,2,9,3,5,null,7});
        expected = 15;
        actual = clz.findTilt(root);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        root = TreeNode.arrayToTree(new Integer[]{21,7,14,1,1,2,2,3,3});
        expected = 9;
        actual = clz.findTilt(root);
        assertEquals(expected, actual);
    }
}
