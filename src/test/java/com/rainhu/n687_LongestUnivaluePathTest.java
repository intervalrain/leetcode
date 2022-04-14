package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.rainhu.ToolUtility.TreeNode;

import org.junit.jupiter.api.Test;

public class n687_LongestUnivaluePathTest {
    
    n687_LongestUnivaluePath clz = new n687_LongestUnivaluePath();
    TreeNode root;
    int expected;
    int actual;

    @Test
    public void test1(){
        root = TreeNode.arrayToTree(new Integer[]{5,4,5,1,1,5});
        expected = 2;
        actual = clz.longestUnivaluePath(root);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        root = TreeNode.arrayToTree(new Integer[]{1,4,5,4,4,5});
        expected = 2;
        actual = clz.longestUnivaluePath(root);
        assertEquals(expected, actual);
    }
    
    @Test
    public void test3(){
        root = TreeNode.arrayToTree(new Integer[]{5,5,5,5,4,5});
        expected = 4;
        actual = clz.longestUnivaluePath(root);
        assertEquals(expected, actual);
    }

    @Test
    public void test4(){
        root = TreeNode.arrayToTree(new Integer[]{5,5,5,5,4,5,5,5});
        expected = 5;
        actual = clz.longestUnivaluePath(root);
        assertEquals(expected, actual);
    }

    @Test
    public void test5(){
        root = TreeNode.arrayToTree(new Integer[]{1});
        expected = 0;
        actual = clz.longestUnivaluePath(root);
        assertEquals(expected, actual);
    }
}
