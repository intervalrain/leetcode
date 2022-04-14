package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import com.rainhu.ToolUtility.TreeNode;

import org.junit.jupiter.api.Test;

public class n1305_AllElementsInTwoBinarySearchTreesTest{

    n1305_AllElementsInTwoBinarySearchTrees clz = new n1305_AllElementsInTwoBinarySearchTrees();
    TreeNode root1;
    TreeNode root2;
    List<Integer> expected;
    List<Integer> actual;

    @Test
    public void test1(){
        root1 = TreeNode.arrayToTree(new Integer[]{2,1,4});
        root2 = TreeNode.arrayToTree(new Integer[]{1,0,3});
        expected = List.of(0,1,1,2,3,4);
        actual = clz.getAllElements(root1, root2);
        assertEquals(expected.toString(), actual.toString());
    }

    @Test
    public void test2(){
        root1 = TreeNode.arrayToTree(new Integer[]{1,null,8});
        root2 = TreeNode.arrayToTree(new Integer[]{8,1});
        expected = List.of(1,1,8,8);
        actual = clz.getAllElements(root1, root2);
        assertEquals(expected.toString(), actual.toString());
    }

}