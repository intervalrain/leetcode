package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.rainhu.util.TreeNode;

import org.junit.jupiter.api.Test;

public class n1022_SumOfRootToLeafBinaryNubmersTest{
    
    n1022_SumOfRootToLeafBinaryNubmers clz = new n1022_SumOfRootToLeafBinaryNubmers();
    TreeNode root;
    int expected;
    int actual;

    @Test
    public void test1(){
        root = TreeNode.arrayToTree(new Integer[]{1,0,1,0,1,0,1});
        expected = 22;
        actual = clz.sumRootToLeaf(root);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        root = TreeNode.arrayToTree(new Integer[]{0});
        expected = 0;
        actual = clz.sumRootToLeaf(root);
        assertEquals(expected, actual);
    }
}