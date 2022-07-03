package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.rainhu.util.TreeNode;

import org.junit.jupiter.api.Test;

public class n404_SumOfLeftLeavesTest {
    
    n404_SumOfLeftLeaves clz = new n404_SumOfLeftLeaves();
    TreeNode root;
    int actual;
    int expected;

    @Test
    public void test1(){
        root = TreeNode.arrayToTree(new Integer[]{3,9,20,null,null,15,7});
        expected = 24;
        actual = clz.sumOfleftLeaves(root);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        root = TreeNode.arrayToTree(new Integer[]{1});
        expected = 0;
        actual = clz.sumOfleftLeaves(root);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        root = TreeNode.arrayToTree(new Integer[]{1,3,2,4,null,5,7,8});
        expected = 13;
        actual = clz.sumOfleftLeaves(root);
        assertEquals(expected, actual);
    }
    
    @Test
    public void test4(){
        root = TreeNode.arrayToTree(new Integer[]{1,1,null,1,null,1,null,1});
        expected = 1;
        actual = clz.sumOfleftLeaves(root);
        assertEquals(expected, actual);
    }
}
