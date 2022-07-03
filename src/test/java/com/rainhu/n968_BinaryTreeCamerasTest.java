package com.rainhu;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.rainhu.util.TreeNode;

public class n968_BinaryTreeCamerasTest {
    
    n968_BinaryTreeCameras clz = new n968_BinaryTreeCameras();
    TreeNode root;
    int expected, actual;

    @Test
    public void test1(){
        root = TreeNode.buildTree(new Integer[]{0,0,null,0,0});
        expected = 1;
        actual = clz.minCameraCover(root);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        root = TreeNode.buildTree(new Integer[]{0,0,null,0,null,0,null,null,0});
        expected = 2;
        actual = clz.minCameraCover(root);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        root = TreeNode.buildTree(new Integer[]{0});
        expected = 1;
        actual = clz.minCameraCover(root);
        assertEquals(expected, actual);
    }
}
