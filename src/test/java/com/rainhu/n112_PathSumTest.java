package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.rainhu.util.TreeNode;

import org.junit.jupiter.api.Test;

public class n112_PathSumTest {
    
    n112_PathSum clz = new n112_PathSum();
    TreeNode root;
    int targetSum;
    boolean expected;
    boolean actual;

    @Test
    public void test1(){
        root = TreeNode.arrayToTree(new Integer[]{5,4,8,11,null,13,4,7,2,null,null,null,1});
        targetSum = 22;
        expected = true;
        actual = clz.hasPathSum(root, targetSum);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        root = TreeNode.arrayToTree(new Integer[]{1,2,3});
        targetSum = 5;
        expected = false;
        actual = clz.hasPathSum(root, targetSum);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        root = TreeNode.arrayToTree(new Integer[]{1,2});
        targetSum = 0;
        expected = false;
        actual = clz.hasPathSum(root, targetSum);
        assertEquals(expected, actual);
    }

    @Test
    public void test4(){
        root = null;
        targetSum = 0;
        expected = false;
        actual = clz.hasPathSum(root, targetSum);
        assertEquals(expected, actual);
    }

}
