package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.rainhu.util.TreeNode;

import org.junit.jupiter.api.Test;

public class n1302_DeepestLeavesSumTest {
    
    n1302_DeepestLeavesSum clz = new n1302_DeepestLeavesSum();
    TreeNode root;
    int expected, actual;

    @Test
    public void test1(){
        root = TreeNode.arrayToTree(new Integer[]{1,2,3,4,5,null,6,7,null,8});
        expected = 15;
        actual = clz.deepestLeavesSum(root);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        root = TreeNode.arrayToTree(new Integer[]{6,7,8,2,7,1,3,9,null,1,4,null,null,null,5});
        expected = 19;
        actual = clz.deepestLeavesSum(root);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        root = TreeNode.arrayToTree(new Integer[]{50,null,54,null,null,98,6,null,null,null,null,34});
        expected = 34;
        actual = clz.deepestLeavesSum(root);
        assertEquals(expected, actual);

    }
}
