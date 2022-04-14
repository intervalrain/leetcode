package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.rainhu.ToolUtility.ListNode;

import org.junit.jupiter.api.Test;

public class n148_SortListTest {
    
    n148_SortList clz = new n148_SortList();
    ListNode head;
    ListNode expected, actual;

    @Test
    public void test1(){
        head = new ListNode(4,2,1,3);
        expected = new ListNode(1,2,3,4);
        actual = clz.sortList(head);
        assertTrue(expected.equals(actual));
    }

    @Test
    public void test2(){
        head = new ListNode(-1,5,3,4,0);
        expected = new ListNode(-1,0,3,4,5);
        actual = clz.sortList(head);
        assertTrue(expected.equals(actual));
    }

    @Test
    public void test3(){
        head = null;
        expected = null;
        actual = clz.sortList(head);
        assertNull(actual);
    }
}
