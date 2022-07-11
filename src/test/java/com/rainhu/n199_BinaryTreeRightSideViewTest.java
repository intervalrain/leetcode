package com.rainhu;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Arrays;

import com.rainhu.util.Snippet;
import com.rainhu.util.TreeNode;

public class n199_BinaryTreeRightSideViewTest {
    
    n199_BinaryTreeRightSideView clz = new n199_BinaryTreeRightSideView();
    TreeNode root;
    List<Integer> expected, actual;

    @Test
    public void test1(){
        root = Snippet.stringToTreeNode("[1,2,3,null,5,null,4]");
        expected = Arrays.asList(new Integer[]{1,3,4});
        actual = clz.rightSideView(root);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        root = Snippet.stringToTreeNode("[1,null,3]");
        expected = Arrays.asList(new Integer[]{1,3});
        actual = clz.rightSideView(root);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        root = Snippet.stringToTreeNode("[]");
        expected = Arrays.asList(new Integer[]{});
        actual = clz.rightSideView(root);
        assertEquals(expected, actual);
    }
}
