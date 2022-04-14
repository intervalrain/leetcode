package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.rainhu.ToolUtility.TreeNode;

import org.junit.jupiter.api.Test;

public class n337_HouseRobberIIITest{

    n337_HouseRobberIII clz = new n337_HouseRobberIII();
    TreeNode root;
    int expected;
    int actual;

    @Test
    public void test1(){
        root = TreeNode.arrayToTree(new Integer[]{3,2,3,null,3,null,1});
        expected = 7;
        actual = clz.rob(root);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        root = TreeNode.arrayToTree(new Integer[]{3,4,5,1,3,null,1});
        expected = 9;
        actual = clz.rob(root);
        assertEquals(expected, actual);
    }
        
}