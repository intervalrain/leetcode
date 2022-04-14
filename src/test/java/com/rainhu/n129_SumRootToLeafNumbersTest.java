package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.rainhu.ToolUtility.TreeNode;

import org.junit.jupiter.api.Test;

public class n129_SumRootToLeafNumbersTest {
    
    n129_SumRootToLeafNumbers clz = new n129_SumRootToLeafNumbers();
    TreeNode root;
    int actual;
    int expected;

    @Test
    public void test1(){
        root = TreeNode.arrayToTree(new Integer[]{1,2,3});
        expected = 25;
        actual = clz.sumNumbers(root);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        root = TreeNode.arrayToTree(new Integer[]{4,9,0,5,1});
        expected = 1026;
        actual = clz.sumNumbers(root);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        root = TreeNode.arrayToTree(new Integer[]{1,2,3,1,2,3,4});
        expected = 510;
        actual = clz.sumNumbers(root);
        assertEquals(expected, actual);
    }

    @Test
    public void test4(){
        root = TreeNode.arrayToTree(new Integer[]{0});
        expected = 0;
        actual = clz.sumNumbers(root);
        assertEquals(expected, actual);
    }

    @Test
    public void test5(){
        root = TreeNode.arrayToTree(new Integer[]{1,null,5});
        expected = 15;
        actual = clz.sumNumbers(root);
        assertEquals(expected, actual);
    }
}
