package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.rainhu.util.TreeNode;

import org.junit.jupiter.api.Test;

public class n1026_MaximumDifferenceBetweenNodeAndAncestorTest{
    
    n1026_MaximumDifferenceBetweenNodeAndAncestor clz = new n1026_MaximumDifferenceBetweenNodeAndAncestor();
    TreeNode root;
    int expected;
    int actual;

    @Test
    public void test1(){
        root = TreeNode.arrayToTree(new Integer[]{8,3,10,1,6,null,14,null,null,4,7,13});
        expected = 7;
        actual = clz.maxAncestorDiff(root);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        root = TreeNode.arrayToTree(new Integer[]{1,2,null,0,null,null,null,3});
        expected = 3;
        actual = clz.maxAncestorDiff(root);
        assertEquals(expected, actual);
    }
}