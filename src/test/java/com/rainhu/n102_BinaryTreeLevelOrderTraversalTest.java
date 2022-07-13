package com.rainhu;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.List;
import com.rainhu.util.*;

public class n102_BinaryTreeLevelOrderTraversalTest {
    
    n102_BinaryTreeLevelOrderTraversal clz = new n102_BinaryTreeLevelOrderTraversal();
    TreeNode root;
    List<List<Integer>> expected, actual;

    @Test
    public void test1(){
        root = Snippet.stringToTreeNode("[3,9,20,null,null,15,7]");
        expected = Snippet.stringToInt2dList("[[3],[9,20],[15,7]]");
        actual = clz.levelOrder(root);
        assertTrue(ListTest.intEquals(expected, actual));
    }

    @Test
    public void test2(){
        root = Snippet.stringToTreeNode("[1]");
        expected = Snippet.stringToInt2dList("[[1]]");
        actual = clz.levelOrder(root);
        assertTrue(ListTest.intEquals(expected, actual));
    }

    @Test
    public void test3(){
        root = Snippet.stringToTreeNode("[]");
        expected = Snippet.stringToInt2dList("[]");;
        actual = clz.levelOrder(root);
        assertTrue(ListTest.intEquals(expected, actual));
    }
}
