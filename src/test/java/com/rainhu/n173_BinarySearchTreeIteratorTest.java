package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.rainhu.ToolUtility.TreeNode;

import org.junit.jupiter.api.Test;

public class n173_BinarySearchTreeIteratorTest {
    
    @Test
    public void test1(){
        n173_BinarySearchTreeIterator clz = new n173_BinarySearchTreeIterator(TreeNode.arrayToTree(new Integer[]{7, 3, 15, null, null, 9, 20}));
        assertEquals(clz.next(), 3);
        assertEquals(clz.next(), 7);
        assertTrue(clz.hasNext());
        assertEquals(clz.next(), 9);
        assertTrue(clz.hasNext());
        assertEquals(clz.next(), 15);
        assertTrue(clz.hasNext());
        assertEquals(clz.next(), 20);
        assertTrue(!clz.hasNext());
    }
    
}
